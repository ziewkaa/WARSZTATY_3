package pl.coderslab.controllers;

import pl.coderslab.models.Solution;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class homepage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Solution[] solutions = Solution.loadAllSolutions(DbUtil.getConnection(), 5);
            request.setAttribute("solutions", solutions);
            getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        } catch (Exception e){
            e.getStackTrace();
        }

    }
}
