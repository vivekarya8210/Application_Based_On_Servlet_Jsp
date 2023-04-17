

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

<%!public int sum(int x, int y) {
		return x + y;
	}%>

Result ::
<%=sum(10, 20)%>

<%!static {

		System.out.println("test_005fmethod_005fdefinition_005fusing_005fdeclaration_005ftag_jsp ::" + "static block");

	}

	//public test_005fmethod_005fdefinition_005fusing_005fdeclaration_005ftag_jsp(){
	//System.out.println("test_005fmethod_005fdefinition_005fusing_005fdeclaration_005ftag_jsp ::" + "construtor");
	//}

	public void jspInit() {

		System.out.println("jspInit() method");

	}

	public void jspDestroy() {

		System.out.println("jspDestroy() method");

	}%>













