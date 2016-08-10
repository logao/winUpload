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

	public static DataSchema getDataSchema(String className) {
		return getDataSchema("com.ctrip.vac.tool.winupload.dataschema", className);
	}
	
	public static DataSchema getDataSchema(String packageName, String className) {
		DataSchema ds = null;
		
		try {
			Class<?> ds_cls =  Class.forName(packageName+"."+className);
			ds = (DataSchema) ds_cls.newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
		
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
	    STRING, INT, LONG;
	
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
			default:
				if (columnName.endsWith("date")) {
					return "date";
				} else {
					return "varchar(300)";
				}
		}
	}
}
