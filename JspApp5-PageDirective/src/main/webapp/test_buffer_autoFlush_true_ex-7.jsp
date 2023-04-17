<%@ page buffer="none" autoFlush="false"%>


<b>Here we take autoFlush is false</b>
<b>It shows error buffer="none" means here buffer is 0kb</b>



<%
for (int i = 0; i < 1000; i++) {
	if (i % 20 == 0)
		out.flush();
	out.print("Ohm" + i + "<br>");
}
%>

