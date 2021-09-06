<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp"%>
	
	<h1 align="center">Welcome to Rays Technology</h1>



	<form action="ForgetController" method="get">

		<table align="center">x
			<tr>
				<th>Email id</th>
				<td><input type="text" name="login"></td>
			<center><font color = "red"><%
				String u = (String) request.getAttribute("error");
				if (u!= null) {
				%>
				<%=u%>
				<%
				}
				%>
				</font></center>
				<center><font color = "red"><%
				String e = (String) request.getAttribute("email");
				if (e != null) {
				%>
				<%=e%>
				<%
				}
				%>
				</font></center>
			</tr>
<tr>
				<td align="center" colspan="2"><input type="submit"
					name="operation" value="Get Password"></td>
			</tr>
			<tr>
			<td align="center" colspan="2">
				<a href="LoginView.jsp">Login</a> | <a href="ChangeView.jsp">Change Password</a></td>
			</tr>

		</table>
		<%@ include file="Footer.jsp"%>

</body>
</html>