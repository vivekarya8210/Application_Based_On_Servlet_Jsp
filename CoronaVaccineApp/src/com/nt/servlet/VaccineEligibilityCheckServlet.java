package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VaccineEligibilityCheckServlet extends HttpServlet {

	
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
		
		// get PrintWriter
		
		PrintWriter pw=res.getWriter();
		
		//set response contentType
		
		
		res.setContentType("text/html");
		
		
		//read form data (req parameter values)
		
		String name=req.getParameter("pname");
		
		int age=Integer.parseInt(req.getParameter("page"));
		
		String addrs=req.getParameter("paddrs");
		
		//write b.logic(request processing logic)
		
		
		if(age<18)
			pw.println("<h1 style='color:red;text-align:center'>Mr/Miss/Mirs." +name+ " You are not eligible for corona Vaccine</h1> ");
		else if(age>18)
		 pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mirs." +name+ " You are eligible for corona Vaccine</h1> ");
		
	   //Add home Hyperlink
		pw.println("<a href='crnl'><img src='images/vaccine.jpg'></a>");
		
		pw.close();
		}
	}
