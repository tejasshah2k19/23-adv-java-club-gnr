package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email.equals("admin@gmail.com") && password.equals("admin123")) {
			// true
			//setattribute -> email 
			
			//create cookie 
			Cookie c = new Cookie("email", email); //cookie name , cookie value 
			
			//set cookie to client's browser 
			response.addCookie(c);
			
			
			
			request.getRequestDispatcher("CHome.jsp").forward(request, response);
		} else {
			// wrong
			request.getRequestDispatcher("CLogin.jsp").forward(request, response);
		}

	}

}
