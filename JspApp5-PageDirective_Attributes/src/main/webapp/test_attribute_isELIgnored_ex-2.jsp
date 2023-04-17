<%-- 

Directive Tags
-------------------
    => These tags give dircetions to jsp page compiler to generates java code JES class.. 
    => These tags do not allow to place java code directly ...but we can place directions or instructions or 
         instructions for jsp page compiler to reflect the java code in jsp page.

          Syntax::  <%@<directive tags> attributes %>
          
          xml syntax::<jsp:<directive tag name> attributes/>

    3 Types of Directive Tags
    ----------------------------------
    
       1)page directive
       2)include directive
       3)taglib directive
   
      1)page directive
      -----------------------
            =>Gives insturctions to jsp page compiler through its attributes to generate global or common java 
                code instructions in JES class source code.
                
        Syntax:: <%@page attributes%>
        
        The attributes are
        -------------------------
                  a)language   
                  b)import
                  c)contentType
                  d)pageEncoding
                  e)info
                  f)extends
                  g)session
                  h)buffer
                  i)autoFlush
                  j)isELIgnored
                  k)isThreadSafe
                  l)errorPage
                  m)isErrorPage
  
--%>
<%--
isELIgnored
---------------

  it is always recommended to minmize or avoid java code directly in jsp page
  i.e minimize or avoid scripting tags utilization in jsp pages.But performing arithemetic and logical operations using 
  tags is not possible ...To make it possible without java code jsp supports EL(Expression Language).

   Syntax::
   
             ${<expression>}
             
             e.g::    ${4+5}==>gives 9
--%>

<%@page isELIgnored="false"%>

   Result::${4+8 }<br>

<b>Hello</b>


















