package com.realdolmen.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jonsnow on 24/08/16.
 */

@WebServlet (urlPatterns = "/cookie.html")
public class CookieServlet extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String value = getCookieValue("myColor", "red");

//        Cookie cookie= new Cookie("Name","Jimi");
        resp.addCookie(new Cookie("David", "Hallo"));

        PrintWriter out= resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head></head>");
        out.println("<body style ='backgrpoung color'"+value+">HelloWorld</body>");
        out.println("</html>");


        resp.getWriter().println("OK");

        Cookie[] cookie1 = req.getCookies();

        for (Cookie cookie : cookie1) {

            if (cookie.getName().equals("David")) {
                //This is the one

                resp.getWriter().println("OK" + cookie.getValue());


            }
        }

    }

    private String getCookieValue(String req, String myColor) {


        return getCookieValue("myColor", "red");
    }

}

