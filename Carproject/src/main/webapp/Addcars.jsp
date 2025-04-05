<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add car in parking</title>
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<div class="container">
	
	<form action="SaveCarServlet" method="post">
	
		<label>Enter car Number</label>
		<input type="number" name="txtnumber">
		<label>Enter the car owner name </label>
		<input type="text" name="txtname">
		<input type="submit" value="Save">
</body>
</html>