<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Profile</title>
</head>
<body>
	
	<div class="profile-box">
	
	
	<h1>My Profile</h1>
	<table>

	
	<tr>
		<td>Bus ID</td>
		<td>${busDetails.busID}</td>
	</tr>
	
	<tr>
		<td>Owner Name</td>
		<td>${busDetails.ownerName}</td>
	</tr>
	
	<tr>
		<td>Owner Contact Number</td>
		<td>${busDetails.contactNo}</td>
	</tr>
	
	<tr>
		<td>Owner Email</td>
		<td>${busDetails.ownerEmail}</td>
	</tr>
	 
	<tr>
		<td>Bus Number</td>
		<td>${busDetails.busNo}</td>
	</tr>
	
	<tr>
		<td>Bus Type</td>
		<td>${busDetails.BType}</td>
	</tr>
	
	<tr>
		<td>No Of Seats</td>
		<td>${busDetails.noOfSeats}</td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td>${busDetails.password}</td>
	</tr>
	
	</table> 

	<br>
	
	<a href="<%=request.getContextPath()%>/UpdateBus" class="font">Update Data</a>
	
	
	<br><br>
	
		<a href="<%=request.getContextPath()%>/DeleteBus?busid=${busDetails.busID}" class="font">Delete Data</a>
	
	
	</div>
</body>
</html>