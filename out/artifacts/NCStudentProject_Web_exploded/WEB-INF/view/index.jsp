<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Spring MVC Form Handling</title>--%>
<%--</head>--%>

<%--<body>--%>
<%--<h2>Enter developer information</h2>--%>
<%--<form:form method="post" action="addStudent">--%>
    <%--<table>--%>
            <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td><form:label path="id">Id</form:label></td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td><form:input path="id" /></td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
        <%--<tr>--%>
            <%--<td><form:label path="name">Name</form:label></td>--%>
            <%--<td><form:input path="name"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="age">age</form:label></td>--%>
            <%--<td><form:input path="age"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="pass">password</form:label></td>--%>
            <%--<td><form:input path="pass"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td colspan="2">--%>
                <%--<input type="submit" value="submit"/>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
<%--</body>--%>

<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My first JSP page</title>
</head>
<body>
<h1>JSP Starts here</h1>
<%
    String name = request.getParameter("name");
    if (name == null) { %>
<h2>I need your name.</h2>
<a href="?name=Kitty">Try this link</a>
<% } else { %>
<h2>Hello, <%=name %>
</h2>
<% }
%>
</body>
</html>
