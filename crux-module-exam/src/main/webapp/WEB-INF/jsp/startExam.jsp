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
    <title>开始考试</title>
</head>
<body>
    ${requestScope.taoTiQuestion[0].taoTi.nameT}<br/>
    <br/>
    总共2题共100分<br/>
    <br/>
    一.${requestScope.taoTiQuestion[0].type}<br/>

    <form action="http://localhost:8080/Student/EndExam" method="post">
    <c:forEach items="${requestScope.taoTiQuestion}" var="list" varStatus="s">
        ${s.count}.         <!--varStatus="s"到s.count可产生自增序号-->
        ${list.subject}<br/>
            <input type="radio" name="question${s.count}" value="A" />
                ${list.optionA}<br/>
            <input type="radio" name="question${s.count}" value="B" />
                ${list.optionB}<br/>
            <input type="radio" name="question${s.count}" value="C" />
                ${list.optionC}<br/>
            <input type="radio" name="question${s.count}" value="D" />
                ${list.optionD}<br/>
            <br/>
    </c:forEach>
    <input type="submit" value="提交">
    </form>
</body>
</html>
