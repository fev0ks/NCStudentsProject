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
            <td>code:</td>
            <td>${code} </td>

        </tr>
        <tr>
            <td>user_vk_info:</td>
            <td>${user_vk_info}</td>
        </tr>
    </form:form>
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
                <input type="submit" value="notice" />
            </td>
        </tr>
    </form:form>
</table>
</body>

</html><%--<a href="https://oauth.vk.com/authorize?client_id=5950277&display=page&redirect_uri=http://localhost:8080&scope=friends&response_type=code&v=5.63">Authorization VK</a>--%>
