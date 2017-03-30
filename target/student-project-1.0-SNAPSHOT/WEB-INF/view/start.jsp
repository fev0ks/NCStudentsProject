<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>Hey</title>
</head>
<body>
<h2>StartPage</h2>


<form:form action="/goHome" method="post">
    <td>${text}</td>
    <tr>
        <a href="https://oauth.vk.com/authorize?client_id=5950277&display=page&redirect_uri=http://localhost:8080/goHome&scope=friends&response_type=code&v=5.63"
           title="VK">VK</a>
    </tr>
    <tr>

        <br>
        <td>
            code:  <% String code = request.getParameter("code");
            if (code == null) { %>
            <%="nothhing"%>
            <% } else { %>
            <%=code%>
            <%}%>
        </td>
        </br>
    </tr>

    <%--<tr>--%>
    <%--<a href="https://oauth.vk.com/access_token?client_id=5950277&client_secret=hzFYcQ1s5iYXogqTmzWz&redirect_uri=http://localhost:8080/&code=<%=code%>"--%>
    <%--title="VK">VK acces</a>--%>
    <%--</tr>--%>

    <tr>
    <form:form action="goHome" method="get">
        <tr>
            <td colspan="5">
                <input type="text" name="code" value=<%=code%>/>
                <input type="submit" value="goHome"/>
            </td>
        </tr>
    </form:form>
    </tr>
    <tr>
        <form:form action="goHome" method="post">
            <td colspan="1">
                <input type="submit" value="VK login"/>
            </td>
        </form:form>

    </tr>
</form:form>
</body>
</html>