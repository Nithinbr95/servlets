<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<style>
#foot{
margin-top: 200px;
}
</style>
<body>
<nav class="navbar navbar-light bg-light" id="nav"></nav>
<div class="container-fluid" style="background-color: #0F1111;">
    <a class="navbar-brand" href="#">
      <img src="https://p1.hiclipart.com/preview/321/69/300/farmer-cartoon-agriculture-agribusiness-logo-tractor-agritech-crop-yellow-png-clipart.jpg" alt="" width="30" height="24" class="d-inline-block align-text-top">
      <b>Garden</b>
    </a>
    <a href="index.jsp"><input type="button" value="HOME" style="background-color: aqua;"></a>
  </div><br><br>
<form action="update" align = "center" method = "post">
<input type = "hidden" placeholder="Id" id="id" name = "id" value="${search.id}"><br><br>
<input type = "text" placeholder="Enter Garden Name" id="name" name = "name" value ="${search.name}"><br><br>
<input type = "text" placeholder="Garden Space" id="space" name = "space" value ="${search.space}"><br><br>
<input type = "text" placeholder="Number of Plants" id="plants" name = "plants" value="${search.plants}"><br><br>
<input type = "text" placeholder="Enter Garden City" id="city" name = "city" value="${search.city}"><br><br>
<button>Update</button>
</form>
</body>

</html>