package pl.coderslab.controllers;

import pl.coderslab.models.Group;
import pl.coderslab.models.User;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/allusers")
public class allusers extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            User[] users = User.loadAllUsers(DbUtil.getConnection());
            request.setAttribute("users", users);
            getServletContext().getRequestDispatcher("/jsp/allusers.jsp").forward(request, response);

        } catch (Exception e) {
            response.getWriter().append("ERROR: " + e.getMessage());
        }

    }
}
