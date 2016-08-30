<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.servlet.annotation.WebServlet" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ToDoList</title>
    <h1>To Do List for me</h1>
</head>
<body>

</body>
<form method='post' action='todo.html'>
    <input type='text' name='input'></input>
    <button type='submit' id='Add'>Add</button>
    <ol>
        <%

            List<String> list = (List<String>) session.getAttribute("MY TODOS");



            if (list != null) {
                for (String item : list) {
                    out.println("<li>" + item + "</li>");
                }
            }
            else {
                out.println("<div>geen resultaat</div>");
            }








        %>

    </ol>
    </form>

</html>
<%!

%>