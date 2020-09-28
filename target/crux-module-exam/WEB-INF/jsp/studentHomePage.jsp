<%--
  Created by IntelliJ IDEA.
  User: shenqingwen
  Date: 2020/9/16
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生主页</title>
</head>
<body>
     您当前登录账号信息：<br/>
     id:${requestScope.student3.id}<br/>
     登录密码:${requestScope.student3.pwd}<br/>
     登录账号名:${requestScope.student3.name}<br/>
     <br/>

     <a href="http://localhost:8080/Student/Exam">开始考试</a><br/>
     <br/>
     <a href="http://localhost:8080/Student/QueryScore">个人成绩查询</a>
</body>
</html>
