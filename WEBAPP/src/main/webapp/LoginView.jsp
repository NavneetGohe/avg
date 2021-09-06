<!DOCTYPE html>
<html>
<head>
	
	<title>project_01</title>
</head>
<body>
<%@ include file= "Header.jsp" %>
	<form action="LoginController" method="get"> 

<br>
<br>



	<h1 align="center">Login</h1>
	
	<center>
	<label>LoginID*</label>
	<input type="text" name="Login" >
	<br>
	<label>Password*</label>
	<input type="Password" name="Password" >
	
	<br>
<% String st =(String)request.getAttribute("error");
String pass = (String)request.getAttribute("Password");

if(st!=null)
{
%>
<center><h2 style ="color:red"> <%= st %></h2></center>
<%
}
%>
<% 
if(pass!=null)
{
%>
<center><h2 style ="color:green"> <%= pass %></h2></center>
<%
}
%>

	
	<input type="submit" name="SignIn" value="signin">
	<br>
	<a href="RegistrationView.jsp">Sign Up</a> | <a href="ForgetView.jsp">Forget Password</a>

</center>
<%@ include file= "Footer.jsp" %>


</form>
</body>
</html>