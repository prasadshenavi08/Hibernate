<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove cars</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
	<form action="RemoveServlet" method="post">
		<label for="txtid">Enter the Car ID to Remove car from parking </label>
		<input type="number" name=txtid>
		<input type="submit" value="Delete">
</body>
</html>