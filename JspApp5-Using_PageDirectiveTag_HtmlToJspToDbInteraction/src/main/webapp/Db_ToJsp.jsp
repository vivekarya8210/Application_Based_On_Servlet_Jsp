

<%@page import="java.sql.*"%>

<%!Connection con = null;
	PreparedStatement ps1 = null;
	PreparedStatement ps2 = null;

	private static final String INSERT_QUERY = "INSERT INTO JSP_PERSON_INFO VALUES(PID_SEQ.NEXTVAL,?,?,?,?)";

	private static final String SELECT_QUERY = "SELECT PID,PNAME,PAGE,PADD,EMAILID FROM JSP_PERSON_INFO";

	public void jspInit() {
		// get ServletConfig object directly

		ServletConfig cg = getServletConfig();
		String driver = cg.getInitParameter("driverClass");
		String url = cg.getInitParameter("jdbcurl");
		String user = cg.getInitParameter("dbuser");
		String pwd = cg.getInitParameter("dbpwd");

		try {
			//Load jdbc driver class
			Class.forName(driver);
			//establish the connection
			con = DriverManager.getConnection(url,user,pwd);
			//create PreapredStatement objs

			ps1 = con.prepareStatement(SELECT_QUERY);
			ps2 = con.prepareStatement(INSERT_QUERY);

		} ///try
		catch (SQLException se) {

			se.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}%>
<%
//read addtional req param value

String pval = request.getParameter("p1");

if (pval.equalsIgnoreCase("Register")) { //for submit buttton

	//read form data

	String name = request.getParameter("pname");
	int age = Integer.parseInt(request.getParameter("page"));
	String addrs = request.getParameter("paddrs");
	String mail = request.getParameter("mailId");
	//set value to query params(?)

	ps2.setString(1,name);
	ps2.setInt(2,age);
	ps2.setString(3,addrs);
	ps2.setString(4,mail);

	//execute the query

	int result = ps2.executeUpdate();

	//process the results

	if (result == 0) {
%>

<h1 style="color: red; text-align: center">Record not inserted</h1>
<%
} else {
%>
<h1 style="color: red; text-align: center">Record inserted</h1>

<%
} //else

}//if
else {
//execute query

ResultSet rs = ps1.executeQuery();
%>

<table border="1"  bgcolor=" cyan" align="center">

	<tr>
		<th>Pid</th>
		<th>Name</th>
		<th>Age</th>
		<th>Addrs</th>
		<th>Email-Id</th>
	</tr>
	<%
	//process the result
	while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getInt(3)%></td>
		<td><%=rs.getString(4)%></td>
		<td><%=rs.getString(5)%></td>
	</tr>


	<%
	} //while
	%>
</table>
<%
} //else
%>
<center>
	<a href="person_form.html">Home</a>
</center>


<%!public void jspDestroy() {

	try {
		//close jdbc objs
		if (ps1 != null) {

			ps1.close();
		}

	} catch (SQLException se) {

		se.printStackTrace();

	}

	try {
		//close jdbc objs
		if (ps2 != null) {

			ps2.close();
		}

	} catch (SQLException se) {

		se.printStackTrace();

	}

	try {
		//close jdbc objs
		if (con != null) {

			con.close();
		}

	} catch (SQLException se) {

		se.printStackTrace();

	}
}%>


