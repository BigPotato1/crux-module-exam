<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/17
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>student</title>
</head>
<body>
    考生登录<br/>
    <br/>
    <form action="http://localhost:8080/Student/Login" method="post">
        用户名:<br>
        <input type="text" name="name">
        <br>
        密码:<br>
        <input type="text" name="pwd">
        <br><br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
