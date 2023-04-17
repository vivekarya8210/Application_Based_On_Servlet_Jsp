<%@ page buffer="1kb" autoFlush="false"%>

<b>SOLUTION: here we can take condition and use out.flush() after that
	condition</b><br>


<%
for (int i = 0; i < 1000; i++) {
	if (i % 20 == 0)
		out.flush();
	out.print("Ohm" + i + "<br>");
}
%>

