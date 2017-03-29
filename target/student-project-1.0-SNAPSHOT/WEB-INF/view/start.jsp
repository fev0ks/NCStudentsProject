<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<html>
<body>
<h2>StartPage</h2>
<head>

    <form:form method="post" action="/goHome">
        <td>${text}</td>
        <tr>
            <a href="https://oauth.vk.com/authorize?client_id=5950277&display=page&redirect_uri=http://localhost:8080/&scope=friends&response_type=code&v=5.63"
               title="VK">VK</a>
        </tr>
        <tr>
            <br>
            <td>code:  <% String code = request.getParameter("code");
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
        <br>

        <tr>
            <td colspan="1">
                <input type="submit" value="VK login"/>
            </td>
        </tr>
        </br>
    </form:form>
</head>
</body>
</html>