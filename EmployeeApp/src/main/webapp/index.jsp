<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
    <script>
        function updateForm() {
            var role = document.getElementById("role").value;
            var formFields = document.getElementById("formFields");

            formFields.innerHTML = "";
            // Common fields
            formFields.innerHTML += '<label>Name:</label> <input type="text" name="name"><br>';
            formFields.innerHTML += '<label>Age:</label> <input type="number" name="age"><br>';

            // Role-specific fields
            if (role === "Manager") {
                formFields.innerHTML += '<label>Team Size:</label> <input type="number" name="teamSize"><br>';
            } else if (role === "Director") {
                formFields.innerHTML += '<label>Department:</label> <input type="text" name="department"><br>';
            }

            document.getElementById("formFields").style.display = "block";
        }
    </script>
</head>
<body>
    <h2>Select Role</h2>
    <form action="EmployeeServlet" method="post">
        <label>Role:</label>
        <select name="role" id="role" onchange="updateForm()">
            <option value="Employee">Employee</option>
            <option value="Manager">Manager</option>
            <option value="Director">Director</option>
        </select>
        <br><br>

        <div id="formFields">
            
        </div>

        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
