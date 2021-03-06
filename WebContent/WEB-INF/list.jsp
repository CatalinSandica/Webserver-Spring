<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
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
    
    
    <script src="webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>