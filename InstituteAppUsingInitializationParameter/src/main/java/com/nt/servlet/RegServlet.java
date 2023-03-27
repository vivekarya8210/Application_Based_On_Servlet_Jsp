package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class RegServlet extends GenericServlet {
	Connection con;
	PreparedStatement psmt;
	private static final long serialVersionUID = 1L;

	public RegServlet() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {

		// For getting request parameter from LoginInstitute.html we have establish
		// connection with db
		// After connection we store all the parameter in db

		try {
		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "xe", "XEE");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     
		
		res.setContentType("text/html");
		//Here using getParameter()  method we store all the req parameter what ever user input in LoginInstitute.html page
		
		try {
			String s1=req.getParameter("fname");
			String s2=req.getParameter("lname");
			String s3=req.getParameter("uname");
			String s4=req.getParameter("pword");
			
			
			//To store the data  here we use preparedStatement() method bcz it is used to store or Execute Dynamic sql query
			
			psmt=con.prepareStatement("insert into users_data values(?,?,?,?)");
			
			//Here we write code for whatever data user enter ===which is store in db
			
			  psmt.setString(1,s1);
			  psmt.setString(2,s2);
			  psmt.setString(3,s3);
			  psmt.setString(4,s4);
			  //code for inserting data in db
			  psmt.executeUpdate();
			  
			  //here write code for show some msg ===data inserted or not
			  
			  //For this we need getWriter()===which is available in ServletRequest interface--------using ServletRequest reference we call getWriter()
			  //Return type of getWriter() method is PrintWriter
			  
			  PrintWriter pw=res.getWriter();
			  
			  //Using reference of pw here we  print caharcter stream
			  
			  pw.println("You Have Registered Successfully");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	
	public void destroy() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			psmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



