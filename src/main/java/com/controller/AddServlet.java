package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException {
		
		String no1 = request.getParameter("no1");
		String no2 = request.getParameter("no2");
		String opr = request.getParameter("opr"); 
		
		int x = Integer.parseInt(no1);
		int y = Integer.parseInt(no2);
		
		int ans = x + y ; 
		
		response.setContentType("text/html"); 
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("Addition = "+ans);
		out.print("</body>");
		out.print("</html>");
		
		
	}
}
