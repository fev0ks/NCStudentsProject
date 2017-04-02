<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<jsp:forward page="goHome/${user_id}"/>--%>
<%--<c:url var="addAction" value="/goHome/${user_id}"  />--%>
<%--<jsp:forward page="ControllerMain?action=goHome/${user_id}" />--%>
<META HTTP-EQUIV="Refresh" CONTENT="1;URL=goHome/${user_id}">
</body>
</html>
