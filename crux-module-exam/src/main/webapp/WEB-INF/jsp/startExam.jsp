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
    ${requestScope.TaoTiQuestion[0].taoTi.nameT}<br/>
    <br/>
    总共2题共100分<br/>
    <br/>
    一.${requestScope.TaoTiQuestion[0].type}<br/>
    <c:forEach items="${requestScope.TaoTiQuestion}" var="list" varStatus="s">
        ${s.count}.         <!--varStatus="s"到s.count可产生自增序号-->
        ${list.subject}<br/>
        <form id="${s.count}" action="http://localhost:8080/Student/endExam" method="post">
<%--            <input type="radio" checked="checked" name="option" value="A" />--%>
            <input type="radio" name="option" value="A" />
                ${list.optionA}<br/>
            <input type="radio" name="option" value="B" />
                ${list.optionB}<br/>
            <input type="radio" name="option" value="C" />
                ${list.optionC}<br/>
            <input type="radio" name="option" value="D" />
                ${list.optionD}<br/>
            <br/>
            <input type="submit" value="提交">
        </form>
    </c:forEach>

</body>
</html>
