package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class InstituteInfoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InstituteInfoServlet() {
        super();
        
    }

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		//fpw.println("Invalid Username/Password");
		try {
			PrintWriter pw=res.getWriter();
			
			pw.println("<html><body bgcolor=yellow><center><h1>");
			pw.println("Welcome To Naresh i Technologies");
			pw.println("</h1></center></body><html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void destroy() {
		try {
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
