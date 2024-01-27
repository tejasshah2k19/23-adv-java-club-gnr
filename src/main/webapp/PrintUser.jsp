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
	ArrayList<UserBean> listUsers = (ArrayList<UserBean>) request.getAttribute("listUsers");
	
		out.print("FirstName   Email<Br>");
		for(UserBean user:listUsers){
			
			out.println(user.getFirstName()+"&nbsp;"+user.getEmail()+"<BR>");
		}
	
	%>


</body>
</html>