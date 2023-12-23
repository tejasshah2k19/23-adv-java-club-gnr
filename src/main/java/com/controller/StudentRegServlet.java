package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentRegServlet")
public class StudentRegServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException{

		String strAge = request.getParameter("age");//"22"
		int age = Integer.parseInt(strAge); 

		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();//IOException 
		out.print("<html><body>");
		if(age >= 18) {
			//success
			out.print("<font color='green'>Reg Success...</font>");
		}else {
			//you are not eligible 
			out.print("<font color='red'>You are Not Eligible...</font>");
		}
		out.print("</body></html>");
		// Wrapper class
		// byte short char int long float double boolean --> 8 primitive
		// Byte Short Character Integer Float Double Boolean : Void

		// class object array enum ---> non primitive

		// type conversion { non primitive - primitive }
		// String x ="12";
		// int y = 12;
		// int j = x; Integer.parseInt(x);

		// casting {primitive - primitive }
		// int a = 5;
		// int b = 2;
		// float c = (float)a/b; // int/int => int float/int => float int/float -> float
		// 5/2 -> 2.5 -> 2 -> casting -> implicit casting
		// explicit casting

	}
}
