<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<%@ include file = "Header.jsp" %>

    <form action="navneet" method="post">
        
            <h1 align="center">User Registration</h1>
            
            <table align="center">
            

                <tr>
                    <th>First Name*</th>
                    <td><input type="text" name="fname" value="">
                    </td>
                </tr>
                <tr>
                    <th>Last Name*</th>
                    <td><input type="text" name="lname" value="">
                    </td>
                </tr>
                <tr>
                    <th>LoginId*</th>
                    <td><input type="text" name="login" placeholder="Must be Email ID" value="">
                    </td>
                </tr>
                <tr>
                    <th>Password*</th>
                    <td><input type="password" name="password" value="">
                    </td>
              </tr>
                <tr>
                    <th>Gender</th>
                    <td>
                     <select class='form-control' name='gn'>
		<option value='female'>female</option>
		<option value='male'>male</option>
		<option value='othere'>other</option>

                    </td>
                </tr>

                <tr>
                    <th>Contact</th>
                    <td>
                        <input type="number" name="cn" >
                    </td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" name="operation" value="SignUp">
                    </td>
                </tr>
            </table>
            <%@include file="Footer.jsp" %>
            
    </form>
</body>
</html>