<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
</head>
<body>
	<form action="view" method="get">
		<input type="submit" value="submit">
		<table>

			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Space</th>
				<th>Plants</th>
				<th>City</th>
			<tbody>
				<c:forEach var="dto" items="${result}">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.name}</td>
						<td>${dto.space}</td>
						<td>${dto.plants}</td>
						<td>${dto.city}</td>
						<td><input type ="button" class = "btn btn-primary" value = "update">
						<a href = "delete?id=${dto.id}"><input type = "button" class = "btn btn-danger" value = "Delete">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>