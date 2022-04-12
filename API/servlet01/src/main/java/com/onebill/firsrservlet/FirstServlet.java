package com.onebill.firsrservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter writer2 = res.getWriter();
		PrintWriter writer = res.getWriter();
		writer.println("<h1 style='color:green;background-color:yellow'>Hi bro</h1>");
		writer.println("<marquee value='alternate'><h1 style='color:black;background-color:pink'>Hi bro</h1></marquee>");
		writer.println("<input type='text' name='name'>");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
