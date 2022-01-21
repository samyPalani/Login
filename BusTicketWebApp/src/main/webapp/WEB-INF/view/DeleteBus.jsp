<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Insert title here</title>
</head>
<body>
<div class="delete-box">

	<% 
		String ID = request.getParameter("id");
		String ownerName= request.getParameter("name");
		String ownerContact = request.getParameter("contact");
		String ownerEmail = request.getParameter("email");
		String busNo= request.getParameter("BNo");
		String busType = request.getParameter("BType");
		String seats = request.getParameter("Seats");
		String Password = request.getParameter("password");
	
	%>
	
	
	
	<h1>Bus Account Delete</h1><br>
	<form action="BusDetails" method="post">
		Bus ID<br><input type="text" class="box6" name="busid" value="${busDetails.busID }"readonly><br><br>
		Owner Name<br><input type="text" class="box6" name="name" value="${busDetails.ownerName }"readonly><br><br>
		Owner Contact Number<br><input type="text" class="box6" name="contact" value="${busDetails.contactNo }"readonly><br><br>
		Owner Email<br><input type="text" class="box6" name="email" value="${busDetails.ownerEmail }"readonly><br><br>
		Bus Number<br><input type="text" class="box6" name="BNo" value="${busDetails.busNo }"readonly><br><br>
		Bus Type<br><input type="text" class="box6" name="BType" value="${busDetails.BType }"readonly><br><br>
		No Of Seats<br><input type="text" class="box6" name="seats" value="${busDetails.noOfSeats }"readonly><br><br><br>
	
		<input type="submit" class="box7" name="submit" value="Delete my Data">
		
		
	</form>
	
	</div> 

</body>
</html>