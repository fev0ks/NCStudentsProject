<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Enter developer information</h2>
<form:form method="post" action="addStudent">
    <table>
            <%--<tr>--%>
            <%--<td><form:label path="id">Id</form:label></td>--%>
            <%--<td><form:input path="id" /></td>--%>
            <%--</tr>--%>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
        <tr>
            <td><form:label path="age">age</form:label></td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><form:label path="pass">password</form:label></td>
            <td><form:input path="pass"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>

</html>