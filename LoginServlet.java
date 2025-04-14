package com.example.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        if ("admin".equals(username) && "admin".equals(password)) {
            response.getWriter().println("<h1>Welcome, " + username + "!</h1>");
        } else {
            response.getWriter().println("<h1>Login Failed!</h1>");
        }
    }
}

