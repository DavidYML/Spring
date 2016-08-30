package com.realdolmen.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jonsnow on 18/08/16.
 */

@WebServlet (urlPatterns = "/doRegister")
public class RegisterServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));
        Person.Gender gender = Person.Gender.valueOf(req.getParameter("gender"));


        Person p = new Person(firstName, lastName, age, gender);
        System.out.println(p);

        resp.sendRedirect("/index.html");
        ///save in database for example   em.persist(p);
    }
}