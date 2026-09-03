package com.example;

import com.example.model.Expeditions;
import com.example.service.ExpeditionsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/expeditions")
public class ServletExpeditions extends HttpServlet {

    private ExpeditionsService expeditionsService;

    @Override
    public void init() throws ServletException {
        expeditionsService = Application.getContext()
                .getBean("expeditionsService", ExpeditionsService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Expediciones</h1>");

        resp.getWriter().println("<ul>");
        for (Expeditions expeditions : expeditionsService.getExpeditionsList()) {

            resp.getWriter().println("<li>" + expeditions + "</li>");
        }
        resp.getWriter().println("</ul>");
    }
    

}
