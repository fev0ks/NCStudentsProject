<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Home page</h2>
<table>
    <form:form>
    <tr>
        <td>Name:</td>
        <td>${text}</td>
    </tr>
    <tr>
        <td>Random:</td>
        <td>${rand}</td>
    </tr>
    </form:form>
    <%--<tr>--%>
        <%--<td>ID:</td>--%>
        <%--<td>${userEntity.id}</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>date reg:</td>--%>
        <%--<td>${dtRegistration}</td>--%>
    <%--</tr>--%>
    <form:form action="createTask">
        <tr>
            <td colspan="2">
                <input type="submit" value="create task"/>
            </td>
        </tr>
    </form:form>

    <form:form action="profile">
        <tr>
            <td colspan="3">
                <input type="submit" value="profile"/>
            </td>
        </tr>
    </form:form>
    <form:form action="mentorList">
        <tr>
            <td colspan="4">
                <input type="submit" value="mentorList"/>
            </td>
        </tr>
    </form:form>
    <form:form action="notice">
        <tr>
            <td colspan="5">
                <input type="submit" value="notice"/>
            </td>
        </tr>
    </form:form>
</table>
</body>

</html>