<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: shenqingwen
  Date: 2020/9/15
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>查询所有管理员信息</title>
</head>
<body>
     ${requestScope.message}<br/>
     <br/>

     <c:forEach items="${requestScope.allManager3}" var="list">
         ${list.id}
         ${list.pwd}
         ${list.name}<br/>
     </c:forEach>
</body>
</html>
