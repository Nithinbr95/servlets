<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ad Agency Details</title>
    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        h1 {
            color: #333;
        }
        .btn-primary {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="container my-5">
    <h1 class="text-center mb-4">Ad Agency Details</h1>
    <div class="d-flex justify-content-end mb-3">
        <form action="view" method="get">
            <input type="submit" value="Submit" class="btn btn-primary">
        </form>
    </div>
    <table class="table table-bordered table-striped table-hover">
        <thead class="table-dark">
            <tr>
                
                <th>Person Name</th>
                <th>Email</th>
               
                <th>Company Name</th>
                <th>Product Name</th>
                <th>Phone Number</th>
                <th>Description</th>
               <th>Changes</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dto" items="${read}">
                <tr>
                   
                    <td>${dto.personName}</td>
                    <td>${dto.email}</td>
    
                    <td>${dto.companyName}</td>
                    <td>${dto.productName}</td>
                    <td>${dto.contactNumber}</td>
                    <td>${dto.description}</td>
                    <td>
                        <a href="delete?id=${dto.id}" class="btn btn-danger">Delete</a>
                        <a href="update?id=${dto.id}" class="btn btn-success">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>