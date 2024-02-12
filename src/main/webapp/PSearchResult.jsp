<%@page import="com.controller.PSearchServlet"%>
<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
		out.print("<table border='1'>");
		out.print("<tr><td>FirstName</td><td>Email</td></tr>");
		
		for(UserBean user:PSearchServlet.searchList){
			
			out.println("<tr><td>"+user.getFirstName()+"</td><td>"+user.getEmail()+"</td></tr>");
		}
		out.print("</table>");
	
	%>
	<br><br>
	<a href="PSignup.jsp">Add User</a><br>
	<a href="PSearchUser.jsp">Search</a>

</body>
</html>