<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
	<h1>Laptop List</h1>
	<table border="1" width="50%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Model</th>
			<th>Brand</th>
		</tr>

		<c:forEach items="${laptops}" var="laptop">
			<tr>
				<td>${laptop.id}</td>
				<td>${laptop.model_name}</td>
				<td>${laptop.brand_name}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<h1>Add Laptop</h1>
	<form method="post" action="/addlaptop">
		<label for="id">ID:</label><br> <input type="text"
			id="id" name="id"><br> 
			<label
			for="model_name">Model name:</label><br> <input type="text" id="mode_lname"
			name="model_name"><br>
			<label
			for="brand_name">Brand name:</label><br> <input type="text" id="brand_name"
			name="brand_name"><br>
		<br> <input type="submit" value="Add">
	</form>
	<h1>Update Laptop</h1>
	<form method="post" action="/updatelaptop">
		<label for="id">ID:</label><br> <input type="text"
			id="id" name="id"><br> 
			<label
			for="model_name">Model name:</label><br> <input type="text" id="model_name"
			name="model_name"><br>
			<label
			for="brand_name">Brand name:</label><br> <input type="text" id="brand_name"
			name="brand_name"><br>
		<br> <input type="submit" value="Update">
	</form>

</body>
</html>
