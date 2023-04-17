<%@ page buffer="1kb" autoFlush="false"   %>


<b>It shows error===JSP Buffer OverFlow</b>

<%
for(int i=0;i<1000;i++){
	out.print("Ohm"+i+"<br>");
}

%>

<b>SOLUTION:    here we can condition and use out.flush() after that condition</b>