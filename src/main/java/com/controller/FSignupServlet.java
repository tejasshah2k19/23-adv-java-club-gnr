package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//class -> servlet => 3 steps 

@WebServlet("/FSignupServlet")
public class FSignupServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// read
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation

		// insert into database

		// dbconnection
		// 1) mysql driver
		// mysql driver
		// 2) url
		// 3) userName
		// 4) password

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24advgnrclub";
		String dbUserName = "root";
		String dbPassword = "root";

		try {
			// db driver
			// load
			Class.forName(driver); // type 3 --> load
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);

			if (con != null) {
				System.out.println("dBconnected...");
				// insert query

				PreparedStatement pstmt = con
						.prepareStatement("insert into users (firstName,lastName,email,password) values (?,?,?,?)");

				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				pstmt.setString(3, email);
				pstmt.setString(4, password);

				// run->
				int record = pstmt.executeUpdate();

				System.out.println(record + " inserted....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// redirect login
		response.sendRedirect("FLogin.jsp");

	}
}
