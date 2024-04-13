package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/AddProductServlet")
public class AddProductFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String productName = request.getParameter("productName");
		String price = request.getParameter("price");

		// validation
		boolean isError = false;

		if (productName == null || productName.trim().length() == 0) {
			isError = true;
			request.setAttribute("productNameError", "Please Enter Product Name");
		}
		if (price == null || price.trim().length() == 0) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Product Price");
		}

		if (isError == true) {
			// back

			request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
		} else {
			// go ahead
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
