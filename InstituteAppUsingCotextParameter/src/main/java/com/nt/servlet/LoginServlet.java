package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
//@WebServlet("/login")
public class LoginServlet extends GenericServlet {
	Connection con;
	
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	public void init() {
		
		 //  here we got parameter from web.xml(From <context-param>----</context-param>) 
		//   using getInitParameter() method of ServletContext interface
		

		 try {
				ServletContext sc=getServletContext();
				String s1=sc.getInitParameter("driver");
				
				String s2=sc.getInitParameter("url");
				String s3=sc.getInitParameter("username");
				String s4=sc.getInitParameter("password");
				Class.forName(s1);
				con=DriverManager.getConnection(s2,s3, s4);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}
	

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       
		try {

			// Here we get parameter from LoginInstitue.html and store using getParameter() method of ServletRequest interface

			String s1 = req.getParameter("uname");

			String s2 = req.getParameter("pword");

			PreparedStatement psmt = con.prepareStatement("select  *  from users_data where uname=? and pword=?");

			psmt.setString(1, s1);
			psmt.setString(2, s2);
			ResultSet rs = psmt.executeQuery();

			  PrintWriter pw = res.getWriter();
              pw.println("<html><body bgcolor=yellow><center><h1>");
			 if (rs.next()) {
				 pw = res.getWriter();
				pw.println("Welcome To Naresh i Technologies");
				 pw.println("</h1></center></body><html>");
				} 
			else {
				
                pw.println("Invalid Username/Password");
				} 
		}
			 catch (SQLException |IOException e) {
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
	}

}
