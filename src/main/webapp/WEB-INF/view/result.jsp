<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Submitted Student Information ${user}</h2>
<table>
    <tr>
        <td>Name:</td>
        <td>${user.nickname}</td>
    </tr>
    <tr>
        <td>email:</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>ID:</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>date reg:</td>
        <td>${dtRegistration}</td>
    </tr>
    <form:form  action="createTask">
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
</table>
</body>

</html>