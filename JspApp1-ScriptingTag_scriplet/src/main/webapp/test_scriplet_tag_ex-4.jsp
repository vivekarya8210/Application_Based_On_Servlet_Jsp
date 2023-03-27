

<!-- 
==>All the implicit object of jsp are local variables to _jspService(-,-) method and the code placed 
      in scriplet also goes to _jspService(-,-) method ---so in scriplets we can use implicit objects
   
-->

<%
                 String browserName=request.getHeader("user-agent");
                  out.println("current browser name::"+browserName);

%>

<!--  In  scriplet we can call methods... but we can not define methods becoz
        java does not support nested method definitions.
-->


<%--
<% 
     public int sum(int x,int y);     //we got error becoz method declaration also not allowed
	                                                                   
	return x+y;
	}
%>


 --%>








