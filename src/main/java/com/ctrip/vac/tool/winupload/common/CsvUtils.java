package com.ctrip.vac.tool.winupload.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**   
 * CSV����(�����͵���)
 *
 * @author �ּ���
 * @version 1.0 Jan 27, 2014 4:30:58 PM   
 */
public class CsvUtils {
    public String aa;
    /**
     * ����
     * 
     * @param file csv�ļ�(·��+�ļ���)��csv�ļ������ڻ��Զ�����
     * @param dataList ����
     * @return
     */
    public static boolean exportCsv(File file, List<String> dataList){
        boolean isSucess=false;
        
        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(file);
            osw = new OutputStreamWriter(out);
            bw =new BufferedWriter(osw);
            if(dataList!=null && !dataList.isEmpty()){
                for(String data : dataList){
                    bw.append(data).append("\r");
                }
            }
            isSucess=true;
        } catch (Exception e) {
            isSucess=false;
        }finally{
            if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(out!=null){
                try {
                    out.close();
                    out=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }
        
        return isSucess;
    }
    
    /**
     * ����
     * 
     * @param file csv�ļ�(·��+�ļ�)
     * @return
     * @throws IOException 
     */
    public static List<String> importCsv(File file, boolean needFirstLineYn) throws IOException{
        List<String> dataList=new ArrayList<String>();
        String csvSrcEncode = WinUploadCommon.getResource("connection").get("csvSrcEncode");
        String csvTgtEncode = WinUploadCommon.getResource("connection").get("csvTgtEncode");
        
        
        BufferedReader br=null;
        try { 
            br = new BufferedReader(new FileReader(file));
            String line = ""; 
            Long row = Long.valueOf(0);
            
            while ((line = br.readLine()) != null) {
            	if (row>0 || needFirstLineYn) { 
            		dataList.add(new String(line.getBytes(csvSrcEncode), csvTgtEncode));
            	}
            	row++;
            }
        }catch (Exception e) {
        }finally{
            if(br!=null){
                try {
                    br.close();
                    br=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return dataList;
    }
}