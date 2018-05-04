package pl.coderslab.controllers;

import pl.coderslab.models.Exercise;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addexercise")
public class addexercise extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            Exercise exercise = new Exercise();
            exercise.setTitle(title);
            exercise.setDescription(description);
            exercise.saveToDB(DbUtil.getConnection());
        }  catch (Exception e){
            e.getStackTrace();
        }
        response.sendRedirect("/allexercises");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
