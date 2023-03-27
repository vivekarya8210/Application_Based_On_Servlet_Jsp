package com.cp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends GenericServlet {
	private static final long serialVersionUID = 1L;
     Connection con;  
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		 try {
				ServletContext sc=getServletContext();
				String s1=sc.getInitParameter("driver");
				
				String s2=sc.getInitParameter("url");
				String s3=sc.getInitParameter("username");
				String s4=sc.getInitParameter("password");
				Class.forName(s1);
				con=DriverManager.getConnection(s2,s3, s4);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {

			// Here we get parameter from LoginInstitue.html and store

			String s1 = req.getParameter("uname");

			String s2 = req.getParameter("pword");

			PreparedStatement psmt = con.prepareStatement("select  *  from users_data where uname=? and pword=?");

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

		} catch (SQLException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
