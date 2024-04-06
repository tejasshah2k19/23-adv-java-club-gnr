package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId"); // userId
		int uid = Integer.parseInt(userId);
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/24advgnrclub";
			String dbUserName = "root";
			String dbPassword = "root";

			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ?");
			pstmt.setInt(1, uid);
			pstmt.executeUpdate();

			response.sendRedirect("FListUserServlet");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
