package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//java 
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)
	throws IOException {
		System.out.println("SignupServlet called.....");
	
		//read data 
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("FirstName => "+firstName);
		System.out.println("Email => "+email);
		System.out.println("Password => "+password);
		
		
		//validation 
		
		//db save 
		
		// image video mp3 gif xls pdf 
		// HTML 
		
		response.setContentType("text/html"); // MIME Type 
		
		PrintWriter out = response.getWriter();//IOException 
		
		out.print("<html><body>");
		
		out.print("<h2>Hey Signup Done</h2>");
		out.print("FirstName : "+firstName+"<Br>");
		out.print("Email : "+email+"<Br>");
		out.print("Password : "+password+"<Br>");
		
		
		out.print("</body></html>");

	}
}

//1 extends HttpServlet
//2
//3


//lib --> .jar {}

//500 pic -> 500MB -> zip 

//X Y Z A B => .jar  => api 


//jre -> rt.jar , src.zip-> java. System SCanner String Math Exception Thread 

//1) tomcat 
//2) internet








