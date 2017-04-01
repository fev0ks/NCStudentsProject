<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Profile page ${user} </h2>

<table>
    <%--<tr>--%>
    <%--<td><form:label path="id">Id</form:label></td>--%>
    <%--<td><form:input path="id" /></td>--%>
    <%--</tr>--%>
    <tr>
        <td><label ${user.nickname}>Name</label></td>
        <td><input ${user.nickname}/></td>
    </tr>
    <tr>
    <tr>
        <td><label ${user.email}>email</label></td>
        <td><input ${user.email}/></td>
    </tr>
    <tr>
        <td><label ${user.id}>id</label></td>
        <td><input ${user.id}/></td>
    </tr>
    <tr>
        <td>Date</td>
        <td>${dtRegistration}</td>

    </tr>
    <form:form action="profileSave">
        <tr>
            <td colspan="2">
                <input type="submit" value="ok"/>
            </td>
        </tr>
    </form:form>

    <form:form action="/goHome" method="get">
        <tr>
            <td colspan="3">
                <input type="submit" value="home"/>
            </td>
        </tr>
    </form:form>
</table>

</body>

</html>
