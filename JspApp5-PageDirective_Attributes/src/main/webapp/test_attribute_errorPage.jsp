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
   
   I)errorPage
   ---------------
          The page that executes when the exception raised in the jsp page is called error page
          if the error page is jsp page,we can use the implicit obj exception in that jsp page 
          the details of the exception that is raised.
          
   m)isErrorPage     (default value is false)
   ---------------------
                    =>makes the current jsp page error page having access to the implicit object "exception" to display
                    exception message.
                    
                    
                    
                    
 Error pages cfg in jsp programming
 -----------------------------------------------
          => The page that executes only when exception is raised in other jsp page is called Error Page...
                    and it is use to display exception related message as non-technical guiding message to enduser.
                    
                              2 Types of error pages cfg in jsp page
                              
                              a)Local error pages cfg
                              b)Global error pages cfg
                              
            a)Local error pages cfg
            --------------------------------
               =>Error page is specific to one main jsp page
               =>To cfg this ,we need to use errorPage,isErrorPage  attributes of page directive            
   
   
   
          e.g:: <%@page errorPage="error.jsp"%>
             
--%>

<%@page errorPage="error.jsp" %>

<h1 style="color:red;text-align:center">test_attribute_errorPage</h1>

<% int a=Integer.parseInt("a10");%>

<br>
value::<%=a %><br>

<b>end of  test_attribute_errorPage</b>















