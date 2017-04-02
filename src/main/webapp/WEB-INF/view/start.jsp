<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hey</title>
</head>
<body>
<h2>StartPage</h2>


<form:form action="/autoTransfer" method="get">
    <td>${text}</td>
    <tr>
        <a href="https://oauth.vk.com/authorize?client_id=5950277&display=page&redirect_uri=http://localhost:8081/autoTransfer&scope=friends&response_type=code&v=5.63"
        <%--<input type="submit" value="VK" onclick=" location.href=' https://oauth.vk.com/authorize?client_id=595' +--%>
         <%--'0277&display=page&redirect_uri=http://localhost:8081/goHome&scope=friends&response_type=code&v=5.63'  ">--%>
            <%--<a href='https://oauth.vk.com/authorize?client_id=5950277--%>
            <%--&display=page&redirect_uri=http://localhost:8081/autoTransfer&scope=friends&response_type=code&v=5.63'>--%>
                <%--<button>VK</button>--%>
            <%--</a>--%>
    </tr>
    <tr>

</form:form>
</body>
</html>