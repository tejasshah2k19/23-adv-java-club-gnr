package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String no1 = request.getParameter("no1");// 10
		String no2 = request.getParameter("no2");//
		String opr = request.getParameter("opr");// blank null

		String error = "";
		boolean isError = false;

		String regExDigit = "[0-9]+";
		// validation
		if (no1 == null || no1.trim().length() == 0) {
			isError = true;
			error = "Please Enter No1<br>";
		}else if(no1.matches(regExDigit) == false ) {
			isError = true;
			error = "Please Enter Valid No1<br>";
			
		}

		if (no2 == null || no2.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter No2<br>";
		}

		if (opr == null) {
			isError = true;
			error = error + "Please Select Operation<br>";

		}

		if (isError == true) {
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			out.print("<html>");
			out.print("<body>");
			out.print("<font color='red'>");
			out.print(error);
			out.print("</font>");
			out.print("</body>");
			out.print("</html>");
		} else {

			int x = Integer.parseInt(no1);//ram 
			int y = Integer.parseInt(no2);
			int ans = 0;

			if (opr.equals("add")) {
				ans = x + y;
			} else if (opr.equals("sub")) {
				ans = x - y;
			} else if (opr.equals("div")) {

				ans = x / y;
			} else if (opr.equals("mul")) {

				ans = x * y;
			}
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			out.print("<html>");
			out.print("<body>");
			out.print("Ans = " + ans);
			out.print("</body>");
			out.print("</html>");
		}
	}
}
