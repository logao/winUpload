该工具用以上传csv文件至 SQL Server DB，文件上传前需要在工具中注册文件类。
配置的信息都在src/main/resources/connection.properties 下，布置在Linux的时候注意修改文件上传路径以及SQL Server DB 用户名密码。

文件类：
  1. 所有可上传的文件都在包 com.ctrip.vac.tool.winupload.dataschema 中
  2. 注册的文件类必须继承 DataSchema 这个父类，并实现方法 getValueString()，该方法主要用以给用户返回成功上传后的查询结果
  3. 注册类的成员变量即为csv中传入的字段，传入的值应该按顺序对应
  4. 传入的文件名要和文件类名一致
  5. 变量名如果以date结尾，则进入DB后字段会定义为date类型，这样可以处理csv中传入日期格式的各种问题
  
传入的数据：
  1. 传入的数据默认进入bi_pkg@10.8.77.5，并存入以 ‘winupload_’+文件名 的表中
  2. 传入数据的方式为，每次先drop掉数据库中的表，再根据文件类建表，再插入csv中的数据
    