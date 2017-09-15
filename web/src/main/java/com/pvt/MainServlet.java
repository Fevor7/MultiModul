package com.pvt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pvt.functional.Validator;


public class MainServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String LINE_VALUE = "lineValue";

	public MainServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String line = request.getParameter(LINE_VALUE);
		response.getWriter().print(Validator.lineValidator(line));
	}


}
