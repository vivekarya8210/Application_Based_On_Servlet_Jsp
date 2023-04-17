package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
	       //set response content type
			res.setContentType("text/html");
			//get PrintWriter
			pw=res.getWriter();
			//write header content to the web page
			pw.println("<marquee><img src='images/thehindu.png'> </marquee>");
			//do not close stream
			//pw.close();
		
		
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
