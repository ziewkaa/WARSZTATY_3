package pl.coderslab.controllers;

import pl.coderslab.models.Solution;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/solutiondetails")
public class solutiondetails extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Solution solution = Solution.loadSolutionById(DbUtil.getConnection(),id);
            request.setAttribute("solution", solution);
            getServletContext().getRequestDispatcher("/jsp/solution.jsp").forward(request, response);
        } catch (Exception e) {
            response.getWriter().append(e.getMessage());
        }


    }
}
