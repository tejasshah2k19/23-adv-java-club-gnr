<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List User</title>
</head>
<body>

	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>



	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Action</th>
		</tr>

		<%
		while (rs.next() == true) {//first 
			int userId = rs.getInt("userId");
			String firstName = rs.getString("firstName");
			String lastName = rs.getString("lastName");
			String email = rs.getString("email");
		%>
		<tr>
			<td><%=userId%></td>
			<td><%=firstName%></td>
			<td><%=lastName%></td>
			<td><%=email%></td>
			<td><a href="DeleteUserServlet?userId=<%=userId%>">Delete</a></td>
		</tr>

		<%
		}
		%>

	</table>
</body>
</html>