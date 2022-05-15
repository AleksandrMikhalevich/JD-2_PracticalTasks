package servlet;

import entity.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-08 15:22
 */
@WebServlet(name = "studentServ", value = "/info")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentServiceImpl();
        List<Student> students = studentService.findAll();
        req.setAttribute("students", students);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/student1.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req
                .getRequestDispatcher("/student2.jsp");
        requestDispatcher.forward(req, resp);
    }
}
