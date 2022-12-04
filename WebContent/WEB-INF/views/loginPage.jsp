<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/Loginpage" method="get">
	
	<table style="width: 80%">
	
		<tr>
			<td>First Name</td>
			<td><input type="text" name="firstname">	</td>
			
		</tr>
			
		<tr>
			<td>password</td>
			<td><input type="password" id ="pwd" name="pwd">	</td>
		</tr>
			
	</table>
	
	<input type="submit" value="Login">
	
</body>
</html>