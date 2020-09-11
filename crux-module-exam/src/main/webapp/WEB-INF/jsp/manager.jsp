<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/17
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>manager</title>
</head>
<body>
    id:${requestScope.manager3.id}<br/>
    pwd:${requestScope.manager3.pwd}<br/>
    name:${requestScope.manager3.name}<br/>

    <c:forEach items="${allManager}" var="list">
        <tr>
            <td>${requestScope.list.username}</td>
            <td>${requestScope.list.codenum}</td>
            <td>${requestScope.list.address}</td>
        </tr>
    </c:forEach>
</body>
</html>
