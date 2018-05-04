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

@WebServlet("/edituser")
public class edituser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String username = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            int groupid = Integer.parseInt(request.getParameter("group"));

            int id = Integer.parseInt(request.getParameter("id"));
            User user = User.loadUserById(DbUtil.getConnection(), id);
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            user.setGroup(groupid);
            user.saveToDB(DbUtil.getConnection());
        }  catch (Exception e){
            e.getStackTrace();
        }
        response.sendRedirect("/allusers");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        getServletContext().getRequestDispatcher("/jsp/edituser.jsp").forward(request, response);

    }
}
