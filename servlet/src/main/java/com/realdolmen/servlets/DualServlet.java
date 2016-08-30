package com.realdolmen.servlets;

import javax.security.sasl.SaslException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jonsnow on 18/08/16.
 */
public class DualServlet extends HttpServlet {

    private int maxSize;

    //see this as a "constructor" for the servlet


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Creatind Servlet New");
        maxSize = Integer.parseInt(config.getInitParameter("maxSize"));
    }

    @Override


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}