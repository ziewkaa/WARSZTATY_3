package pl.coderslab.controllers;

import pl.coderslab.models.Solution;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/")
public class allsolutions extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int numberSolutions = Integer.parseInt(getServletContext().getInitParameter("number-solutions"));
        response.setContentType("text/html");

        try {
            Solution[] solutions = Solution.loadAllSolutions(DbUtil.getConnection(), numberSolutions);
            request.setAttribute("solutions", solutions);
            getServletContext().getRequestDispatcher("/jsp/allsolutions.jsp").forward(request, response);

        } catch (Exception e) {
            response.getWriter().append("ERROR: " + e.getMessage());
        }


    }
}
