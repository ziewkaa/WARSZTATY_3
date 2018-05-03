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

@WebServlet("/groupusers")
public class groupusers extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int groupId = Integer.parseInt(request.getParameter("id"));
            User[] groupUsers = User.loadAllUsersByGroupId(DbUtil.getConnection(), groupId);
            request.setAttribute("groupUsers", groupUsers);
            getServletContext().getRequestDispatcher("/jsp/groupusers.jsp").forward(request, response);

        } catch (Exception e) {

        }

    }
}
