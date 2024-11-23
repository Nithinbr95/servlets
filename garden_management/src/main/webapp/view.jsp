<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
</head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
.btn{
background-color: aqua;
}
.btn1{
background-color: red;
}
.sub{
background-color: blue;
}

</style>
<body style="background-image: url('grd.jpg');">
<form action="view" method="get" align = "center">
<nav class="navbar navbar-light bg-light" id="nav"> </nav>
<div class="container-fluid" style="background-color: #0F1111;">
    <a class="navbar-brand" href="#">
      <img src="https://p1.hiclipart.com/preview/321/69/300/farmer-cartoon-agriculture-agribusiness-logo-tractor-agritech-crop-yellow-png-clipart.jpg" alt="" width="30" height="24" class="d-inline-block align-text-top">
      <b>Garden</b>
    </a>
    <a href="index.jsp"><input type="button" value="HOME" style="background-color: aqua;"></a>
    <input type="submit" class = "sub" value="submit">
    </div>
   
	
		<table id = "customers" align = "center">

			<tr>
			   
				<th>Id</th>
				<th>Name</th>
				<th>Space</th>
				<th>Plants</th>
				<th>City</th>
				 <th>Status</th>
			<tbody>
				<c:forEach var="dto" items="${result}">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.name}</td>
						<td>${dto.space}</td>
						<td>${dto.plants}</td>
						<td>${dto.city}</td>
						<td><a href = "update?id=${dto.id}"><input type ="button" class = "btn" value = "update"></a>
						<a href = "delete?id=${dto.id}"><input type = "button" class = "btn1" value = "delete"></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>