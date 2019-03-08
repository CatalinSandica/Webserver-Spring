<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
                    rel="stylesheet">
<title>List</title>
</head>
<body>
 <div class="container">
 <h3>List:</h3>
        <table class="table table-striped">
            
            <thead>
                <tr class="tr tr-success">
                    <td>First Name</td>
                    <td>Last Name</td>
                    
                    <td>Password</td>
                </tr>   
            </thead>
            <tbody>
                <c:forEach items="${list}" var="temp">
                    <tr>
                        <td>${temp.firstname}</td>
                        <td>${temp.lastname}</td>              
                        <td>${temp.password}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>