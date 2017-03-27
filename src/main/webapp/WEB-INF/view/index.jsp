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

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Добро пожаловать</title>
</head>
<body>
<h4> Добро пожаловать! </h4>
Поздравляем, вы <b>${visitorCount}</b> посетитель и можете выиграть поездку в столицу Java - Джакарту <br/>

<a href="http://clck.yandex.ru/redir/dtype=stred/pid=7/cid=1228/*http://pogoda.yandex.ru/jakarta"><img src="http://info.weather.yandex.net/jakarta/2.ru.png" border="0" alt=""/><img width="1" height="1" src="http://clck.yandex.ru/click/dtype=stred/pid=7/cid=1227/*http://img.yandex.ru/i/pix.gif" alt="" border="0"/></a>

</body>
</html>