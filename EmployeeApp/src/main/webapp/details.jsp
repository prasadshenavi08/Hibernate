<%@page import="com.example.Employee, com.example.Manager, com.example.Director"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
    <h2>Details of <%= request.getAttribute("employee").getClass().getSimpleName() %></h2>
    <%
        Employee employee = (Employee) request.getAttribute("employee");
        out.println("<p><strong>Name:</strong> " + employee.getName() + "</p>");
        out.println("<p><strong>Age:</strong> " + employee.getAge() + "</p>");

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            out.println("<p><strong>Team Size:</strong> " + manager.getTeamSize() + "</p>");
            
        } else if (employee instanceof Director) {
            Director director = (Director) employee;
            out.println("<p><strong>Department:</strong> " + director.getDepartment() + "</p>");
        }
    %>

    <br>
    <a href="index.jsp">Go Back</a>
</body>
</html>
