package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {

	
 @Override
 public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

	//get PrintWriter
	
	PrintWriter pw=res.getWriter();
	
	//set Response content Type
	
	res.setContentType("text/html");
	
	//Write b.logic to generate the Wish Message
	
	LocalDateTime ldt=LocalDateTime.now(); //gives current Date and Time
	
	int hour=ldt.getHour();//gives current hour of the day 0 to 23
	
	pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString());
	
	if(hour<12)
	  pw.println("<h1 style='color:yellow;text-align:center'>Good Morning</h1>");
	
	else if(hour<16)
	
		pw.println("<h1 style='color:red;text-align:center'>Good Afternoon</h1>");
	
	
	else if(hour<20)
		
		pw.println("<h1 style='color:yellow;text-align:center'>Good Evening</h1>");
	else
		pw.println("<h1 style='color:red;text-align:center'>Good Night</h1>");
	
	
	//Add Home Hyperli
	pw.println("<br><a href='http://localhost:2020/WishApps/page.html'>home</a>");
	
	pw.close();   //close stream
	}
	
}
