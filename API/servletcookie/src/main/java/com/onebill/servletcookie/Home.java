package com.onebill.servletcookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Home extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		String s = req.getParameter("name");
		Cookie cookie = new Cookie("name", s);
		resp.addCookie(cookie);
		writer.println("<h1>Hello " + s + " </h1>");
		writer.println("<form action='./usercredentials' method='post'>"
				+ "<h2>Id : </h2>"
				+"<input type='text' name='id'/><br>"
				+ "<h2>Name : </h2>"
				+"<input type='text' name='username'/><br>"
				+ "<h2>Salary : </h2>"
				+"<input type='text' name='salary'/><br>"
				+ "<h2>Designation : </h2>"
				+"<input type='text' name='designation'/><br>"
				+"<input type='submit' value='submit'/>"
				+ "</form>");

	}
}
