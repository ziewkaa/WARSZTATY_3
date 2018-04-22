package pl.coderslab.controllers;

import pl.coderslab.models.Solution;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/check")
public class check extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Solution solution = Solution.loadSolutionById(DbUtil.getConnection(), 1);
            response.getWriter().append(solution.getDescription());
        } catch (Exception e){
            response.getWriter().append(e.getMessage());
        }

    }
}
