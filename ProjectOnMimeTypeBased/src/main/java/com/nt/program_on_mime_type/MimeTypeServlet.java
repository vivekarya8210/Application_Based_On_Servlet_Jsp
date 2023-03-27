package com.nt.program_on_mime_type;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/mime")
public class MimeTypeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public MimeTypeServlet() {
		super();

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		// set content type

		res.setContentType("text/html");

		// get PrintWriter

		PrintWriter pw = res.getWriter();

		pw.println("<h1 style='color:green;text-align:center'>Your Content Type Successfully set");

	}

}
