<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Student Management</h2>
	<form action="StudentCtl" method="post">
		<table align="center">
			<tr>
				<th>Roll No</th>
				<td><input type="text" name="rollno"></td>
			</tr>
			<tr>
				<th>First Name</th>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="lastname"></td>
			</tr>
			<tr>
				<th>Session</th>
				<td><input type="text" name="session"></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input type="submit" name="operation" value="Add">
				 <input type="submit"name="operation" value="Delete"> 
					<input type="submit"name="operation" value="Modify">
					<input type="submit" name ="opration" value="Get">
					<input type="submit" name ="opration" value="Search">
 					</td>
			</tr>
		</table>
	</form>
</body>
</html>