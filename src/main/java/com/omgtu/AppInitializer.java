package com.omgtu;

import com.omgtu.servlet.*;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AppInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();

        ctx.addServlet("ServicesServlet", new ServicesServlet()).addMapping("/services");
        ctx.addServlet("AboutServlet", new AboutServlet()).addMapping("/about");
        ctx.addServlet("ContactServlet", new ContactServlet()).addMapping("/contact");
        ctx.addServlet("FeedbackServlet", new FeedbackServlet()).addMapping("/feedback");
        ctx.addServlet("ProductServlet", new ProductServlet()).addMapping("/products");
    }
}
