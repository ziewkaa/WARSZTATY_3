package pl.coderslab.controllers;

import pl.coderslab.models.Solution;
import pl.coderslab.models.User;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userdetails")
public class userdetails extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            User user = User.loadUserById(DbUtil.getConnection(), id);
            Solution[] solutions = Solution.loadAllSolutionsByUserId(DbUtil.getConnection(), id);
            request.setAttribute("user", user);
            request.setAttribute("solutions", solutions);
            getServletContext().getRequestDispatcher("/jsp/user.jsp").forward(request, response);
        } catch (Exception e){
            response.getWriter().append(e.getMessage());
        }

    }
}
