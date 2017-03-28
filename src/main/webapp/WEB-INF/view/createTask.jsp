<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>CREATE TASK ${task}</h2>
<h2> ${user}</h2>
<table>
    <tr>
        <td>Name Task</td>
        <td><input name=${task.name} type="text"/></td>
    </tr>
    <tr>
        <td>Describe</td>
        <td><input name=${task.description} type="text"/></td>
    </tr>
    <td>date</td>
    <td>${date}</td>
    </tr>
    <td>id</td>
    <td><${task.id}</td>
    </tr>
    <form:form  action="createTask">
        <tr>
            <td colspan="1">
                <input type="submit" value="save"/>
            </td>
        </tr>

    </form:form>
    <form:form action="home">
    <tr>
        <td colspan="2">
            <input type="submit" value="home"/>
        </td>
    </tr>
</table>
</form:form>
</table>
</body>

</html>