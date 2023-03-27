package com.nt.firstapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();
        pw.println("<html><body bgcolor=yellow  center text=blue><h2></h2><br><br><h1><center>");
       
		pw.println("Welcome to Servlet Programming");
	    pw.println("<h1></center></html></body>");
	}

}
