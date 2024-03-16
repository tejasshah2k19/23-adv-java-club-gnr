<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
<form action="FSignupServlet" method="post">
	FirstName :  <input type="text" name="firstName"/><Br><Br>
	LastName :  <input type="text" name="lastName"/><Br><Br>
	Email : <input type="text" name="email"/><br><br> 
	Password : <input type="password" name="password"/><br><Br>
	
	<input type="submit" value="Signup"/> 
</form>


</body>
</html>