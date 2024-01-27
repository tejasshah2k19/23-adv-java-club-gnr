package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;

public class PSignupServlet extends HttpServlet {

	ArrayList<UserBean> listUsers = new ArrayList<>();
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		
		UserBean userBean  = new UserBean();
		userBean.setFirstName(firstName);
		userBean.setEmail(email);
		userBean.setPassword(password);
		
		listUsers.add(userBean); 
		
		
		request.setAttribute("listUsers", listUsers);

		
		RequestDispatcher rd = request.getRequestDispatcher("PrintUser.jsp");
		rd.forward(request, response);
	
	}

}
