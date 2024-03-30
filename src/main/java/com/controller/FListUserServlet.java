package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FListUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// select * from users

		// db connection

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24advgnrclub";
		String dbUserName = "root";
		String dbPassword = "root";

		try {

			// load driver
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, dbUserName, dbPassword);
			PreparedStatement pstmt = connection.prepareStatement("select * from users");

			ResultSet rs = pstmt.executeQuery(); // select

			// data send
			request.setAttribute("rs", rs);

			// navigate to jsp
			RequestDispatcher rd = request.getRequestDispatcher("FListUser.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
