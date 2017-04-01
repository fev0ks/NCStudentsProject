<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view task page${task}</title>
</head>
<body>
<h2>ViewTaskPage</h2>
<form:form action="/goHome" method="get">
    <tr>
        <td colspan="1">
            <input type="submit" value="VK login"/>
        </td>
    </tr>
</form:form>

</body>

</html>