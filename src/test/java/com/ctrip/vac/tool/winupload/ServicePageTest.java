package com.ctrip.vac.tool.winupload;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.ctrip.vac.tool.winupload.common.WinUploadCommon;
import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class ServicePageTest {

	@Test
	public void testInsertCsvFile() throws Exception {
		//String fileName = "tmp_upload_lg.csv";
		//ServicePage.setDataList(fileName,false); 
		//ServicePage.insertCsvFile();
	}

	@Test
	public void testGetWinUploadConnection() {
		Connection conn = ServicePage.getWinUploadConnection();
	}

	@Test
	public void testGetInsertQueryString() throws Exception {
		String filename = "tmp_upload_lg.csv";
		DataSchema ds = WinUploadCommon.getDataSchema(filename.substring(0,filename.lastIndexOf(".")));
		String sql = ServicePage.getInsertQueryString(ds);
		System.out.println(sql);
	}

	@Test
	public void testGetDropQueryString() throws Exception {
		String filename = "tmp_upload_lg.csv";
		DataSchema ds = WinUploadCommon.getDataSchema(filename.substring(0,filename.lastIndexOf(".")));
		String sql = ServicePage.getDropQueryString(ds);
		System.out.println(sql);
	}
	
	@Test
	public void testGetCreateQueryString() throws Exception {
		String filename = "tmp_upload_lg.csv";
		DataSchema ds = WinUploadCommon.getDataSchema(filename.substring(0,filename.lastIndexOf(".")));
		String sql = ServicePage.getCreateQueryString(ds);
		System.out.println(sql);
	}
	
	@Test
	public void testGetSelectQueryString() throws Exception {
		String filename = "tmp_upload_lg.csv";
		DataSchema ds = WinUploadCommon.getDataSchema(filename.substring(0,filename.lastIndexOf(".")));
		String sql = ServicePage.getSelectQueryString(ds);
		System.out.println(sql);
	}
	
}
