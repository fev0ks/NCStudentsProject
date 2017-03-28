<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>StartPage</h2>
<head>

    <form:form action="home">
        <td>${text}</td>
        <tr>
            <td colspan="1">
                <input type="submit" value="VK login"/>
            </td>
        </tr>
    </form:form>
</head>
</body>
</html>