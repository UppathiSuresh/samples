<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<head>
<title>dynamic web application</title>
</head>
<body>
	<h1>welcome to jsp</h1>
	<h2>simple login page</h2>
	<!-- 
<h2>and it is first application</h2>
 -->

<form action="servlet" method="post">
<table>
<tr>
<td>UserName:</td>
<td> <input type="text" name="loginid" value="" /></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="Password" name="passwordid" value="" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="login" /></td>
</tr>

</table>
		
	</form>
</body>
</html>