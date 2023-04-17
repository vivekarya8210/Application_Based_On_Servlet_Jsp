

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
                        (OR)
 Syntax::   <jsp:declaration>.....
                                                   ..... //global variables
                                                   .....//method definitions
                                                   ......//inner classes definitions
                                                    ......
                       </ jsp:declaration>
                        
--%>

<%-- 
 Problem::

<jsp:declaration>
public String findBig(float a,float b){
	
	if(a<b)
	return "big value::"+b;
	else if(b<a)
	return "big value:+a;
	else
	return "both are equal";
}
</jsp:declaration>


--%>

<!-- Problem:: With the xml  syntax we have problem with  "<" symbol and we can overcome 
                            problem using <![CDATA[...]]> concept       -->

<!-- Solution -->
<jsp:declaration>public String findBig(float a, float b) {<![CDATA[if (a < b)
		return "big value::" + b;
	else if (b < a)
		return "big value:" + a;
	else
		return "both are equal";
}]]></jsp:declaration>


Result::<%=findBig(20, 12)%>




