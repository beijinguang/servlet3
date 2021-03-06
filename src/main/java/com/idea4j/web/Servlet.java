package com.idea4j.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by markee on 2016/11/2.
 */
@WebServlet("/hello")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("now", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,response);
    }
}
