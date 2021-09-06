<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Welcome</title>
</head>
<body>

	<%@ include file = "Header.jsp" %>
	<form action="WelcomeCtl" method= "get"></form>
	<br>
	
<%String s= (String)session.getAttribute("fname");
  out.println("welocme " +s);
%>
<BR>
<br>
	<h1 align="center"><font color="red">Welcome To ORS</font></h1>
	<a href="LogOut.jsp">Logout</a>
    <%@include file="Footer.jsp" %>
</body>
</html>