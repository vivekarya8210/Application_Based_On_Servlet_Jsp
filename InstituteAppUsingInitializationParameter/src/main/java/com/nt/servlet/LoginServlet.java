package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {
	Connection con;
	PreparedStatement psmt;
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	public void init(ServletConfig config) {
		
       //  here we got parameter from web.xml(From <init-param>----</inii-param>)  
	  //   using getInitParameter() method of ServletConfig interface
		
		
		
		try {
			String s1 = config.getInitParameter("driver");

			String s2 = config.getInitParameter("url");
			String s3 = config.getInitParameter("username");
			String s4 = config.getInitParameter("password");
			
			Class.forName(s1);
			con=DriverManager.getConnection(s2,s3, s4);
					
		} catch (ClassNotFoundException | SQLException e) {
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

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		try {

			// Here we get parameter from LoginInstitue.html and store using getParameter() method of ServletRequest interface

			String s1 = req.getParameter("uname");

			String s2 = req.getParameter("pword");

			psmt = con.prepareStatement("select  *  from users_data where uname=? and pword=?");

			psmt.setString(1, s1);
			psmt.setString(2, s2);
			ResultSet rs = psmt.executeQuery();

			PrintWriter pw = res.getWriter();
			pw.println("<html><body bgcolor=yellow><center><h1>");
			if (rs.next()) {

				pw.println("Welcome To Naresh i Technologies");

			} else {

				pw.println("Invalid Username/Password");
			}
			pw.println("</h1></center></body><html>");

		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
