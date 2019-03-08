<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="notcopy" method="post">  
<input type="text" name="fname" value="Firstname..." onclick="this.value=''"/><br/> 
<input type="text" name="lname" value="Lastname..." onclick="this.value=''"/><br/> 
<input type="text" name="uname" value="Username..." onclick="this.value=''"/><br/>  
<input type="text" name="upass"  value="Password..." onclick="this.value=''"/><br/>  
<input type="submit" value="Submit"/>  
</form> 
</body>
</html>