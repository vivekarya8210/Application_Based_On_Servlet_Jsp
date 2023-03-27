package com.nt.timeinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class TimeInfoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public TimeInfoServlet() {
		super();

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		Date d = new Date();
		PrintWriter pw = res.getWriter();

		pw.println("Current Time :: " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

	}

}
