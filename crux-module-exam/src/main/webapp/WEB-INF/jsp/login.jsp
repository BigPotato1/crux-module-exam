<%--
  Created by IntelliJ IDEA.
  User: shenqingwen
  Date: 2020/9/15
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
     您当前登录账号信息：<br/>
     id:${requestScope.manager3.id}<br/>
     登录密码:${requestScope.manager3.pwd}<br/>
     登录账号名:${requestScope.manager3.name}<br/>
     <br/>

     <a href="http://localhost:8080/Manager/AllManager">查询所有管理员账号信息</a><br/>
     <a href="http://localhost:8080/Manager/AllStuResult">查询所有学生各科考试成绩</a>
</body>
</html>
