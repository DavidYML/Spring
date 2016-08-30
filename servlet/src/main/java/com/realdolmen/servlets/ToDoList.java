package com.realdolmen.servlets;


import javax.imageio.IIOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/todo.html")
public class ToDoList extends HttpServlet {



//    @Override


//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//        String myList = getInitParameter("");
//
//        PrintWriter out = resp.getWriter();
//
//        out.println();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>ToDoList</head>");
//        out.println("<h1></h1>");
//        out.println("<body></body>");
//        out.println("<form method='post' action='todo.html'>");
//        out.println("<input type='text' name='input'></input>");
//        out.println("<button type='submit' id='Add'>Add</button>");
//        out.println("<ol>");
//        List<String> list = (List<String>) req.getSession().getAttribute("MY TODOS");
//        if (list != null) {
//            for (String item : list) {
//                out.println("<li>" + item + "</li>");
//            }
//        }
//        else {
//            out.println("<div>geen resultaat</div>");
//        }
//        out.println("</ol>");
//        out.println("</form>");
//        out.println("</html>");
//
//
//    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession s =req.getSession();
        List<String> list = myList(req.getSession());

        String myList = "MY TODOS";

        if (list==null) {

            list= new ArrayList<>();

            s.setAttribute(myList,list);
        }

        String value =req.getParameter("input");

        if(value != null && !value.trim().isEmpty()) {

            list.add(value);


        }


        resp.sendRedirect("/ToDoList.jsp");

//        resp.getWriter().println(value);





    }

    private List<String> myList(HttpSession session) {
     return (List<String>) session.getAttribute("MY TODOS");
    }


    }



