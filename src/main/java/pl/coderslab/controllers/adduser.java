package pl.coderslab.controllers;

import pl.coderslab.models.User;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adduser")
public class adduser extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            int group = Integer.parseInt(request.getParameter("group"));
            User user = new User(name, email, password, group);
            user.saveToDB(DbUtil.getConnection());
        } catch (Exception e){
            e.getStackTrace();
        }

        response.sendRedirect("/allusers");
    }
}
