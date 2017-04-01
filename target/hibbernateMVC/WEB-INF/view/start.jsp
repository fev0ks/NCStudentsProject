<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hey</title>
</head>
<body>
<h2>StartPage</h2>


<form:form action="/goHome" method="post">
    <td>${text}</td>
    <tr>
        <a href="https://oauth.vk.com/authorize?client_id=5950277&display=page&redirect_uri=http://localhost:8081/goHome&scope=friends&response_type=code&v=5.63"
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

</form:form>
</body>
</html>