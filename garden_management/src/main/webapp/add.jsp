<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Garden Details</title>
</head>
<body>
<nav class="navbar navbar-light bg-light" id="nav">
<div class="container-fluid" style="background-color: #0F1111;">
    <a class="navbar-brand" href="#">
      <img src="https://p1.hiclipart.com/preview/321/69/300/farmer-cartoon-agriculture-agribusiness-logo-tractor-agritech-crop-yellow-png-clipart.jpg" alt="" width="30" height="24" class="d-inline-block align-text-top">
      <b>Garden</b>
    </a>
    <a href="index.jsp"><input type="button" value="HOME" style="background-color: aqua;"></a>
  </div><br><br>
<form action="submit" align = "center" method = "post">
<input type = "text" placeholder="Enter Garden Name" name = "name"><br><br>
<input type = "text" placeholder="Garden Space" name = "space"><br><br>
<input type = "text" placeholder="Number of Plants" name = "plants"><br><br>
<input type = "text" placeholder="Enter Garden City" name = "city"><br><br>
<input type = "submit" value = "submit">
</form>
</body>
</html>