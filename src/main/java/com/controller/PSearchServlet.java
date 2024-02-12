package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;

 
public class PSearchServlet extends HttpServlet {
	 
       
	public static ArrayList<UserBean> searchList = new ArrayList<UserBean>();//method 
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//logic 
		String search = request.getParameter("search");//sachin 
		
		
		//gandhinagar 
		//gar 
		
		//exact search -> equals 
		
	
		for(UserBean u: PSignupServlet.listUsers) {
			if(u.getFirstName().toLowerCase().contains(search.toLowerCase())) {
				searchList.add(u); 
			}
		}
		request.getRequestDispatcher("PSearchResult.jsp").forward(request, response);
		//searchList ->set -> next jsp forward -> next jsp -> list print 
		
	}

}
