package pl.coderslab.controllers;

import pl.coderslab.models.Group;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addgroup")
public class addgroup extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            Group group = new Group(name);
            group.saveToDB(DbUtil.getConnection());
        }  catch (Exception e){
            e.getStackTrace();
        }
        response.sendRedirect("/allgroups");

    }
}
