<%@ page buffer="none" autoFlush="true"%>

<b>Here we take autoFlush is true</b>


<b>so here it is work</b>


<%
for (int i = 0; i < 1000; i++) {
	if (i % 20 == 0)
		out.flush();
	out.print("Ohm" + i + "<br>");
}
%>

