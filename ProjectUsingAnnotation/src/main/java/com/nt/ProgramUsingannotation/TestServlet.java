package com.nt.ProgramUsingannotation;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/test")
public class TestServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public TestServlet() {
		super();

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		// get PrintWriter
		PrintWriter pw = res.getWriter();

		// set response content type

		res.setContentType("text/html");

		pw.println("<h1 style='color:red;text-align:center'>Welcome To Naresh i Technologies</h1>");

	}

}
