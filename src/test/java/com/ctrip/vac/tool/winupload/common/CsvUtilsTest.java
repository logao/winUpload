package com.ctrip.vac.tool.winupload.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CsvUtilsTest {

    @Test
    public void testExportCsv() {
        List<String> dataList=new ArrayList<String>();
        dataList.add("1,张三,男");
        dataList.add("2,李四,男");
        dataList.add("3,小红,女");
        boolean isSuccess=CsvUtils.exportCsv(new File("D:\tmp\tmp_upload_lg2.csv"), dataList);
        System.out.println(isSuccess);
//        Assert.assertEquals("export faile", isSuccess, true);
    }
    
    @Test
    public void testImportCsv()  {
        List<String> dataList=CsvUtils.importCsv(new File("D:/tmp/tmp_upload_lg.csv"),false);
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }
    
    @Test
    public void testImportCsvWithANSI()  {
    	CsvUtilsTest.class.getSuperclass().getFields();    	
    	
        List<String> dataList=CsvUtils.importCsv(new File("D:\tmp\tmp_upload_lg.csv"),true);
        if(dataList!=null && !dataList.isEmpty()){
            for(String data : dataList){
                System.out.println(data);
            }
        }
    }    
    
    
}
