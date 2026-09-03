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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String name = req.getParameter("name");
        String code = req.getParameter("code");
        String region = req.getParameter("region");
        String baseCamp = req.getParameter("baseCamp");
        String leader = req.getParameter("leader");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String estate = req.getParameter("estate");

        String result = expeditionsService.save(id, name, code, region, baseCamp, leader, startDate, endDate, estate);

        if (result.equals("OK")) {
            resp.getWriter().println("OK");
        }else  {
            resp.getWriter().println("ERROR");
        }
    }

}
