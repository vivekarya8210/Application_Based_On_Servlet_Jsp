

<%--Declaration Tag
======================
==>This tag is given to place java code in JES before  _jspService(-,-) method
==>This tag can be used to declare global variables(both static and instance) 
   to define java methods to --to place jspInit() method definitions and also to place inner classes definition.

Syntax::   <%!....
                        ..... //global variables
                        .....//method definitions
                        ......//inner classes definitions
                        ......
                        %>
--%>

<%!   int a=10;  //global variable   %>

 <% int a=20;   //local variable %>
 
 value of local variable ::<%=a %><br><br>
 value of global variable ::<%=a %><br><br>
   
   <!-- Here we see prrority goes to local variable so if we want to accesss global variable 
      than we have to use this or page
  -->
    value of global variable ::<%=this.a %>
   
 
 
 
 


