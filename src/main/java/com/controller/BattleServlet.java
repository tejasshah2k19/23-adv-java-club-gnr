package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BattleServlet")
public class BattleServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String a = request.getParameter("a");
		String b = request.getParameter("b");

		// validation
		boolean isError = false;

		if (a == null || a.trim().length() == 0) {
			isError = true;
		}
		if (b == null || b.trim().length() == 0) {
			isError = true;
		}

		if (isError == true) {
			// goBack
			RequestDispatcher rd = request.getRequestDispatcher("InputCard.jsp");
			rd.forward(request, response);

		} else {
			// goAhead
			RequestDispatcher rd = request.getRequestDispatcher("BattleResult.jsp");
			rd.forward(request, response);

		}

	}
}
