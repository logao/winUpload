package com.ctrip.vac.tool.winupload.dataschema;

import java.util.ArrayList;

import org.junit.Test;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

import junit.framework.Assert;

public class DataSchemaTest {
	@Test
	public void testGetAllColumnName() {
		
		DataSchema tb = new tmp_upload_lg();
		ArrayList ColumnListName = new ArrayList<String> ();
		ArrayList ColumnListQm = new ArrayList<String> ();
		
		ColumnListName.add("c1");
		ColumnListName.add("c2");
		ColumnListName.add("c3");
		ColumnListName.add("c4_date");
		
		ColumnListQm.add("?");
		ColumnListQm.add("?");
		ColumnListQm.add("?");
		ColumnListQm.add("?");
		
		System.out.print(tb.getColumnListNameWithType());
		
		Assert.assertEquals("schema wrong", ColumnListName, tb.getColumnListName());
		Assert.assertEquals("schema db wrong", "bi_pkg", tb.getDbName());
		Assert.assertEquals("schema tb wrong", "winupload_tmp_upload_lg", tb.getTableName());
		Assert.assertEquals("schema db..tb wrong", "bi_pkg..winupload_tmp_upload_lg", tb.getDbTableName());
		Assert.assertEquals("schema Column Num wrong", 4, tb.getColumnNumber());
		Assert.assertEquals("schema Column qm wrong", ColumnListQm, tb.getColumnListQm());
	}
}
