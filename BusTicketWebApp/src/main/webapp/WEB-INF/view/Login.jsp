<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Login</title>
</head>
<body>
	
	<div class="login-box">
	
	<h1>Login here</h1><br>
	<form action="Login" method="post">
		Bus Number<br><input type="text" class="box2" name="BusNo" placeholder="Enter Bus Number" required><br><br>
		Password<br><input type="password" class="box2" name="password" placeholder="Enter Password" required><br><br><br>
		
		<input type="submit" class="box3" name="submit" value="Login"><br><br>
	</form>
	<a href="<%=request.getContextPath()%>/BusRegister" class="reg">Register New Bus</a>

	</div>
	
</body>
</html> 