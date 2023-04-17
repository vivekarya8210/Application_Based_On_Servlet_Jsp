
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
  e)info
  ---------
   => Useful to provide short description about jsp page
   =>This attribute info is reflect in JES class by overriding
       getServlet() method.
       
   Syntax:: <%@page info="test jsp page"%>


 --%>

<%@ page info="test jsp page"%>
<b>Hello</b>
