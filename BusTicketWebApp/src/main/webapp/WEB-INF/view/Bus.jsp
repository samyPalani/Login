<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Bus Registrations</title>
</head>
<body>
	
	<div class="reg-box">
	
	<h1>Register your Bus</h1><br>
	<form action="BusRegister" method="post">
	Owner Name:<br><input type="text" class="box8" name="owner" placeholder="Enter Owner Name"><br><br>
	Owner Contact Number:<br><input type="text" class="box8" name="contact" placeholder="Enter Owner contact Number"><br><br>
	Owner Email:<br><input type="text" class="box8" name="email" placeholder="Enter Owner Email"><br><br>
	Bus Number:<br><input type="text" class="box8" name="BNo" placeholder="Enter Bus Number"><br><br>
	Bus type:<br><input type="text" class="box8" name="type" placeholder="Enter Bus Type"><br><br>
	No of Seats:<br><input type="text" class="box8" name="seats" placeholder="Enter No Of Seats"><br><br>
	Password:<br><input type="password" class="box8" name="pwd" placeholder="Enter Password"><br><br><br>
	
	<input type="submit" class="box9" name="submit" value="Register">
	<input type="reset" class="box9" name="reset" value="Re-enter"><br><br>
	
	</form>
	
	<br>
		<a href="<%=request.getContextPath()%>/Login" class="form">Already Registered? Login Here</a>
	
	
	</div>

</body>
</html>