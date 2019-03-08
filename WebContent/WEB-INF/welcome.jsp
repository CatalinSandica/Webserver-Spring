<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome ${firstname}</title>
</head>
<body>
<h2>
User Details
</h2>
<table>
	<tr>
		<td>
			Client name = <b>${firstname} ${lastname } </b>
		</td>
	</tr>	
	<tr>
		<td>
			Client's username = <b>${username }</b>
		</td>
	</tr>
	<tr>
		<td>
			Client's password = <b>${password }</b>
		</td>
	</tr>
</table>
</body>
</html>