<%@ page contentType="text/html;charset=utf-8" %> 
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.output.*" %>
<%@ page import="com.ctrip.vac.tool.winupload.*" %>

<%
	int i = ServicePage.runner(request,false);

	switch (i) {
		case 0:
			List<String> dataList = ServicePage.getSql_dataList();
		
			out.println("数据上传成功: <br><br>");
			out.println( "数据传入了表:" + ServicePage.getDs().getDbTableName() +"@" + ServicePage.getDs().getHost() + "<br><br>");		
			out.println( "传入的数据如下:<br>");
			out.println( ServicePage.getDs().getColumnListNameWithType()+"<br>");
			for(String str: dataList) {
				out.println("" + str + "<br>");	
			}
			break;
		case 1:
			out.println("没有获取到上传文件，请重试");
			break;
		case 2:
			out.println("文件名没有在系统中注册，如需上传文件请联系度假数据组: va_bi@Ctrip.com");
			break;		
		case 3:
			out.println("文件格式有问题,该文件正确的输入格式为<br>");
			out.println(ServicePage.getDs().getColumnListNameWithType());
			break;					
	} 
	
%>