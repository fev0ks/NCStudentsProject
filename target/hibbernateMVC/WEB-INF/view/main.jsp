<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Main page</h2>
<table>
    <form:form>
        <tr>
            <%--<p th:text="${param.code}">Test</p>--%>
                <p>${code} Test</p>
                <%--<p th:text="${param.code}">Get code</p>--%>
        </tr>
    </form:form>
</table>
</body>

</html>