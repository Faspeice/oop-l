package com.omgtu.servlet;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ContactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/contacts.html").forward(req, resp);
    }
}

