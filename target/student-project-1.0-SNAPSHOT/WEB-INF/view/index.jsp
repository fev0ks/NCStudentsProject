<html>
<head>
    <title>Start jsp</title>
</head>
<body>
<h1>Message: ${message}</h1>

<ul>
    <li><p><b>Name:</b>
        <%= request.getParameter("name")%>
    </p></li>
    <li><p><b>Age:</b>
        <%= request.getParameter("age")%>
    </p></li>
</ul>
</body>
</html>
