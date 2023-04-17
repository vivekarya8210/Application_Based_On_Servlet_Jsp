

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

<%--Not possible to acces to use implicits objects in the declarations tags
becoz the code placed in declaration tag goes outside of the _jspService(-,-) method and the jsp implicits objs
are the local variables of _jspService(-,-) method.

--%>

<%!public void jspInit(ServletConfig cg) {

		System.out.println("jspInit(-) method");
		//out.println("<b>hello</b>");  //Gives Error

	}%>
<b>Hello</b>

















