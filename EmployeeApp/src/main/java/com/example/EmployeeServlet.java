package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;


public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        Object employee = null;

        if ("Employee".equals(role)) {
            employee = new Employee(name, age);
            
        } else if ("Manager".equals(role)) {
            int teamSize = Integer.parseInt(request.getParameter("teamSize"));
            employee = new Manager(name, age, teamSize);
            
        } else if ("Director".equals(role)) {
            String department = request.getParameter("department");
            employee = new Director(name, age, department);
        }

        request.setAttribute("employee", employee);

        RequestDispatcher dispatcher = request.getRequestDispatcher("details.jsp");
        dispatcher.forward(request, response);
    }
}

