<%@page import="com.controller.PSignupServlet"%>
<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

	<%
	 
	
	
	//ArrayList<UserBean> listUsers = (ArrayList<UserBean>) request.getAttribute("listUsers");
	
		out.print("<table border='1'>");
		out.print("<tr><td>FirstName</td><td>Email</td></tr>");
		
		for(UserBean user:PSignupServlet.listUsers){
			
			out.println("<tr><td>"+user.getFirstName()+"</td><td>"+user.getEmail()+"</td></tr>");
		}
		out.print("</table>");
	
	%>
	<br><br>
	<a href="PSignup.jsp">Add User</a><br>
	<a href="PSearchUser.jsp">Search</a>

</body>
</html>