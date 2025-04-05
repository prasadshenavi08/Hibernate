<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit cars number and owner name</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>

	<form action="EditServlet">
		<label for="txtid">Enter the employee ID to update </label>
		<input type="number" name=txtid>

		<label>Enter the  number </label>
		<input type="name" name="txtnumber">
		<label>Enter the name </label>
		<input type="text" name="txtname">
		<input type="submit" value="Update">
</form>
</body>
</html>