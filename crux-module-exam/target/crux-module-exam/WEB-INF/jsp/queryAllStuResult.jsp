<%--
  Created by IntelliJ IDEA.
  User: shenqingwen
  Date: 2020/9/15
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有学生各科考试成绩</title>
</head>
<body>
    ${requestScope.message}<br/>
    <br/>

    <c:forEach items="${requestScope.allStuResult}" var="list">
        ${list.id}
        ${list.student.name}
        ${list.taoTi.nameT}
        ${list.resSingle}
        ${list.resMore}
        ${list.resTotal}<br/>
    </c:forEach>
</body>
</html>
