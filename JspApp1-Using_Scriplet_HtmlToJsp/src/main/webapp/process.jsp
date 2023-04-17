
<%
//read form data

   int v1=Integer.parseInt(request.getParameter("t1"));
   int v2=Integer.parseInt(request.getParameter("t1"));
//calculate sum

int sum=v1+v2;
   
%>
<br>sum is<%=sum%><br>
<%
if(sum>=1000){%>     //here write java code with in using jsp tags
<b>sum is too big</b>  //and when we right html/css code no need to include in jsp tags
<%}
else{%>
<b>sum is small</b>
	
<% }%>

