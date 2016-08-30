package com.realdolmen.servlets;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.SystemColor.text;

@WebServlet (urlPatterns = "/agepredictor.html")

public class AgePredictor extends HttpServlet {
    @Override


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        PrintWriter out= resp.getWriter();

        String agent= req.getHeader("User-Agent");
        if (agent.contains("Mozilla")) {

        }



        String name = req.getParameter("name");
//        try {
            String ages  = req.getParameter("age");
            int agei = Integer.parseInt(ages);
//         catch (NumberFormatException e) ;
//            out.println("false");



//        resp.setHeader("David", "Hallo");
//        resp.setHeader("Content-Type","text/plain");
//        resp.setStatus(307);
//        resp.setHeader("Location", "http://www.google.com");


        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>AgePredictor</title>");
        out.println("</head>");
        out.println("<h1> Hallo "+ name + " next year you'll be " + (agei + 1) + " years old</h1>");
        out.println("<body>");
        out.println("</html>");


    }

}
