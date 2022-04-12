package com.onebill.firsrservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Home extends HttpServlet{

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter writer = res.getWriter();
//		String parameter = req.getParameter("name");
//		writer.println("<h1>Welcome "+parameter+"</h1>");
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String parameter = req.getParameter("name");
		writer.println("<h1>Welcome "+parameter+"</h1>");
	}
	
}
