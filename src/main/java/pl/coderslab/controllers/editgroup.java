package pl.coderslab.controllers;

import pl.coderslab.models.Group;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/editgroup")
public class editgroup extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            int id = Integer.parseInt(request.getParameter("id"));
            Group group = Group.loadGroupById(DbUtil.getConnection(), id);
            group.setName(name);
            group.saveToDB(DbUtil.getConnection());
        }  catch (Exception e){
            e.getStackTrace();
        }
        response.sendRedirect("/allgroups");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        getServletContext().getRequestDispatcher("/jsp/editgroup.jsp").forward(request, response);

    }
}
