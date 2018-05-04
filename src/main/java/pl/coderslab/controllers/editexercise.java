package pl.coderslab.controllers;

import pl.coderslab.models.Exercise;
import pl.coderslab.models.Group;
import pl.coderslab.utils.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/editexercise")
public class editexercise extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            int id = Integer.parseInt(request.getParameter("id"));
            Exercise exercise = Exercise.loadExcerciseById(DbUtil.getConnection(), id);
            exercise.setTitle(title);
            exercise.setDescription(description);
            exercise.saveToDB(DbUtil.getConnection());
        }  catch (Exception e){
            e.getStackTrace();
        }
        response.sendRedirect("/allexercises");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        getServletContext().getRequestDispatcher("/jsp/editexercise.jsp").forward(request, response);

    }
}
