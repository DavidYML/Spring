<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>Dit is mijn eerste JSP pagina</h1>

        <%

            out.println(java.time.LocalDateTime.now());

        %>
</body>
</html>
