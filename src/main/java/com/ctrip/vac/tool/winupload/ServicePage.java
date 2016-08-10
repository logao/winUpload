package com.ctrip.vac.tool.winupload;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.ctrip.vac.tool.winupload.common.CsvUtils;
import com.ctrip.vac.tool.winupload.common.WinUploadCommon;
import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class ServicePage {

	static File file;
	static List<String> dataList;
	static List<String> sql_dataList;
	

	static DataSchema ds;
	static int maxFileSize = 5000 * 1024;
	static int maxMemSize = 5000 * 1024;
	
	public static int runner (HttpServletRequest request, boolean needFirstLineYn) throws Exception {
		int i=uploadFile(request,needFirstLineYn);
		if (i>0) {return i;}
		
		i=insertCsvFile();
		if (i>0) {return i;}		
		
		return 0;
	}
	
	public static int uploadFile(HttpServletRequest request, boolean needFirstLineYn) throws Exception {

		String filePath = WinUploadCommon.getResource("connection").get("filePath");
		String contentType = request.getContentType();
		if ((contentType.indexOf("multipart/form-data") >= 0)) {

			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(maxMemSize);
			factory.setRepository(new File("c:\\temp"));
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setSizeMax(maxFileSize);
			
			List<?> fileItems = upload.parseRequest(request);
			Iterator<?> i = fileItems.iterator();
			
			while (i.hasNext ()) {
				FileItem fi = (FileItem)i.next();
				if ( !fi.isFormField () ) {
					String fileName = fi.getName();
					// 写入文件
					if( fileName.lastIndexOf("\\") >= 0 ){
						file = new File(filePath,fileName.substring( fileName.lastIndexOf("\\"))) ;
					}else{
						file = new File(filePath,fileName.substring(fileName.lastIndexOf("\\")+1)) ;
					}
					
					// 文件落地写入
					fi.write(file) ;					
					
					try {
						ds = WinUploadCommon.getDataSchema(file.getName().substring(0,file.getName().lastIndexOf(".")));
						ds.getDbName();
					} catch (Exception e) {
						return 2;
					}
					
					// 提取csv文件的每行数据
					dataList=CsvUtils.importCsv(file,needFirstLineYn);				
					
					return 0;
				}
			}			
		}
		return 1; 		
	}
	
	public static void setDataList(String fileName, boolean needFirstLineYn) throws IOException {
		String filePath = WinUploadCommon.getResource("connection").get("filePath");
		file = new File(filePath,fileName) ;
		dataList=CsvUtils.importCsv(file,needFirstLineYn);	
	}
	
	public static int insertCsvFile() throws Exception {
		
		String drSql = getDropQueryString(ds);
		String crSql = getCreateQueryString(ds);
		String inSql = getInsertQueryString(ds);
		String slSql = getSelectQueryString(ds);
		
		Object[][] params = new Object[dataList.size()][ds.getColumnNumber()];
        for (int i=0; i<dataList.size(); i++) {
        	for(int j=0; j<ds.getColumnNumber(); j++) {
        		try {
        			params[i][j] = dataList.get(i).split(",")[j];
        		} catch (Exception e) {
        			return 3;
        		}
        	}
        }
        runQuery(drSql);
        runQuery(crSql);
        runQuery(inSql,params);
		runQuery(slSql,ds);
		
		return 0;
	}
	

	// drop create
	private static void runQuery(String sql) {
		Connection conn = getWinUploadConnection();
		QueryRunner qr = new QueryRunner();
		try {
			qr.update(conn, sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(conn);
		}
	}
	
	// insert
	private static void runQuery(String sql, Object[][] params) throws SQLException {
		Connection conn = getWinUploadConnection();
		QueryRunner qr = new QueryRunner();
		try {
			qr.batch(conn,sql,params);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(conn);
		}
	}	

	// select
	private static void runQuery(String sql, DataSchema ds) {
		Connection conn = getWinUploadConnection();
		QueryRunner qr = new QueryRunner();
		List l = null;
		
		try {
			l=(List)qr.query(conn, sql,new BeanListHandler(ds.getClass()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(conn);
		}
		
		sql_dataList = new ArrayList<String>();
		
		for(Object o: l) {
			sql_dataList.add(((DataSchema)o).getValueString());
		}
		
	}	
	
	public static DataSchema getDs() {
		return ds;
	}
	
	public static Connection getWinUploadConnection () {
		Connection conn = null;
		String url = "";
		String jdbcDriver = "";
		String user = "";
		String password = "";
		
		try {
			Map<String, String> valList = WinUploadCommon.getResource("connection");
			url = valList.get("url");
			jdbcDriver = valList.get("jdbcDriver");
			user = valList.get("user");
			password = valList.get("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		DbUtils.loadDriver(jdbcDriver);

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return conn;
	}

	public static String getInsertQueryString(DataSchema ds) throws Exception {
		StringBuilder sql = new StringBuilder();
		
		sql.append("insert into ");
		sql.append(ds.getDbTableName());
		sql.append("("+WinUploadCommon.listToString(ds.getColumnListName())+") ");
		sql.append("values("+WinUploadCommon.listToString(ds.getColumnListQm())+")");
		
		return sql.toString();
	}
	
	public static String getDropQueryString(DataSchema ds) throws Exception {
		StringBuilder sql = new StringBuilder();
		
		sql.append("drop table ");
		sql.append(ds.getDbTableName());
		
		return sql.toString();
	}
	
	public static String getCreateQueryString(DataSchema ds) throws Exception {
		StringBuilder sql = new StringBuilder();
		
		sql.append("create table ");
		sql.append(ds.getDbTableName());
		sql.append(" ("+WinUploadCommon.listToString(ds.getColumnListNameWithType())+")");
		
		return sql.toString();
	}
	
	public static String getSelectQueryString(DataSchema ds) throws Exception {
		StringBuilder sql = new StringBuilder();
		
		sql.append("select * from ");
		sql.append(ds.getDbTableName());
		
		return sql.toString();
	}	
	
	public static List<String> getSql_dataList() {
		return sql_dataList;
	}

	public static void setSql_dataList(List<String> sql_dataList) {
		ServicePage.sql_dataList = sql_dataList;
	}

}
