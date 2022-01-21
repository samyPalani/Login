<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">


<title>Insert title here</title>
</head>
<body>
 
	
	<div class="update-box">
	
	<h1>Update the Account</h1><br>
	<form action="UpdateBus" method="post">
		Bus ID<br><input type="text" class="form" name="busid" value="${busDetails.busID }"readonly><br><br>
		Owner Name<br><input type="text" class="form" name="name" value="${busDetails.ownerName }"><br><br>
		Owner Contact Number<br><input type="text" class="form" name="contact" value="${busDetails.contactNo }"><br><br>
		Owner Email<br><input type="text" class="form" name="email" value="${busDetails.ownerEmail }"><br><br>
		Bus Number<br><input type="text" class="form" name="BNo" value="${busDetails.busNo }"><br><br>
		Bus Type<br><input type="text" class="form" name="BType" value="${busDetails.BType }"><br><br>
		No Of Seats<br><input type="text" class="form" name="seats" value="${busDetails.noOfSeats }"><br><br>
		Passwords<br><input type="password" class="form" name="password" value="${busDetails.password }"><br><br><br>
		<input type="submit" class="submit" name="submit" value="Update Data">
		
		
	</form>
	
	
	</div> 
</body>
</html> 