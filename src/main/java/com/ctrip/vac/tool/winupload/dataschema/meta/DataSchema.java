package com.ctrip.vac.tool.winupload.dataschema.meta;

import com.ctrip.vac.tool.winupload.common.WinUploadCommon;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

public abstract class DataSchema {
	
	private String host;
	private String dbName;
	private String tableName;
	private ArrayList<String> columnListName;
	private ArrayList<String> columnListNameWithType;
	private ArrayList<String> columnListQm;
	private int columnListNum;
	
	public DataSchema() {
		Map<String, String> valList = null;
		
		try {
			valList = WinUploadCommon.getResource("connection");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String defaultTbPrefix = valList.get("defaultTbPrefix");
		
		host = valList.get("url").substring(valList.get("url").lastIndexOf("/")+1);
		dbName = valList.get("defaultDb");
		tableName = defaultTbPrefix + this.getClass().getSimpleName();
		columnListNameWithType = new ArrayList<String> ();
		columnListName = new ArrayList<String> ();
		columnListQm = new ArrayList<String> ();
		columnListNum = 0;

		List<Field> sp_f = new ArrayList<Field>();
		Collections.addAll(sp_f, this.getClass().getSuperclass().getFields());
		
		for(Field f: this.getClass().getFields()){
			if(!sp_f.contains(f)) {
				columnListName.add(f.getName());
				columnListNameWithType.add(f.getName() + " " + WinUploadCommon.getDbDataType(f.getName(),f.getType().toString()));
				columnListQm.add("?");
				columnListNum++;
			}
		}
	}
	
	public void setDbName(String db) {
		this.dbName = db;		
	}
	
	public String getHost() {
		return host;
	}
	
	public String getDbName() {
		return dbName;		
	}
	
	public String getTableName() {
		return tableName;		
	}	
	
	public String getDbTableName() {
		return dbName + ".." + tableName;		
	}		
	
	public ArrayList<String> getColumnListNameWithType() {
		return columnListNameWithType;
	}	
	
	public ArrayList<String> getColumnListName() {
		return columnListName;
	}
	
	public ArrayList<String> getColumnListQm() {
		return columnListQm;
	}	
	
	public int getColumnNumber() {
		return columnListNum;		
	}
	
	public String getColumnName(int i) {
		return columnListName.get(i);
	}
	
	public abstract String getValueString();
	
 	public static  String createString (Object[] args) {
 		String res="";
 		boolean firstColumn = true;
 		for(Object o: args) {
 		    if(firstColumn) {
				res = o.toString();
			} else {
				res += "," + o.toString();
			}
			firstColumn = false;
		}
		return res;
	}


}
