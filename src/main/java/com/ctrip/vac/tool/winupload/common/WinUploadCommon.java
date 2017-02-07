package com.ctrip.vac.tool.winupload.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import com.ctrip.vac.tool.winupload.dataschema.meta.DataSchema;

public class WinUploadCommon {

	public static Map<String,String> getResource(String resourceName) throws IOException {
		ResourceBundle rb = ResourceBundle.getBundle(resourceName);  
	    Enumeration<String> allKey = rb.getKeys();  
	    Map<String,String> map = new HashMap<String,String>();  
	    while (allKey.hasMoreElements()) {  
	        String key = allKey.nextElement();  
	        String value = (String) rb.getString(key);  
	        map.put(key, value);  
	    }
		return map;
	}

	public static DataSchema getDataSchema(String className) throws Exception {
		return getDataSchema("com.ctrip.vac.tool.winupload.dataschema", className);
	}
	
	public static DataSchema getDataSchema(String packageName, String className) throws Exception {
		DataSchema ds = null;
		Class<?> ds_cls =  Class.forName(packageName+"."+className);
		ds = (DataSchema) ds_cls.newInstance();
		return ds;
	}
	
	public static String listToString(ArrayList<String> al) {
		StringBuilder res = new StringBuilder();
		boolean flag = false;
		
		for(String s: al) {
			if(flag) {
				res.append(",");
			} else {
				flag=true;
			}
			res.append(s);
		}
		
		return res.toString();
	}

	public enum EnumJvDateType {
	    STRING, INT, LONG, DOUBLE;
	
	}
	public static String getDbDataType(String columnName, String jvDataType) {
		String str = jvDataType.toUpperCase();
		if (str.contains(".")) {
			str=str.substring(str.lastIndexOf(".")+1);
		}
		
		EnumJvDateType e = EnumJvDateType.valueOf(str);
		switch (e) 	{ 
			case INT:
				return "int";
			case LONG:
				return "bigint";
			case DOUBLE:
				return "decimal(12,4)";
			default:
				if (columnName.endsWith("date")) {
					return "date";
				} else {
					return "varchar(300)";
				}
		}
	}
}
