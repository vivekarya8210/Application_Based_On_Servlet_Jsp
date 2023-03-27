
<!--
==>The code placed in scriplet tags goes to _jspService() of JES class as it is
==>This tag is useful to place b.logic /request processing logic in JSP  page
==>Using this tag we can place java code to declare the variables and these variables
becomes local variables to _jspService(-,-) method of JES class.
-->
<% int x=10;
       int y=50;
      out.print(x+y);
%>

<br><br>
<!-- 
==>All the implicit object of jsp are local variables to _jspService(-,-) method and the code placed 
      in scriplet also goes to _jspService(-,-) method ---so in scriplets we can use implicit objects
   
-->

<%
                 String browserName=request.getHeader("user-agent");
                  out.println("current browser name::"+browserName);

%>
