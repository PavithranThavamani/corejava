package com.onebill.servletcookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Welcome Admin</h1>");
		writer.println("<form action='./home' method='post'>"
				+"<h3> Username : </h3>"
				+"<input type='text' name='name'/><br>"
				+"<h3>Password : </h3>"
				+"<input type='text' name='password'/><br>"
				+"<input type='submit' value='submit'/>"
				+ "</form>");
	}
}
