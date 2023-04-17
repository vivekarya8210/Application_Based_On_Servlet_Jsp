
<%--

  Action Tags In Jsp
  -----------------------
        =>These tags internally uses multiple apis including servlet
        api to place the equivalent JES class and to complete the requirement.
        
                Different Types action tags in jsp
                --------------------------------------------
                
                a)Standard Action Tags
                b)Custom Action Tags
                c)JSTL Tags (Jsp Standard Tag Library Tags)
                d)Third Party Action Tags (Given by Third Party Vendors like structs,spring mvc,and etc..)
                
                
                a)Standard Action Tags
                -------------------------------
                    1)<jsp:include>
                    2)<jsp:forward>
                    3)<jsp:useBean>
                    4)<jsp:setProperty>
                    5)<jsp:getProperty>
                    6)<jsp:plugin>
                    7)<jsp:fallback>
                    8)<jsp:param>
                    9)<jsp:params>
                                     and etc....

--%>

<%--

Action include/Dynamic include/<jsp:include>
--------------------------------------------------------------
      =>This tag internally uses rd.include(-,-) and performs output inclusion of dest web to source jsp page
      =>This tag does not perform code inclusion of destination comp,but performs output inclusion of dest comp to source jsp page.
      
      
      =>Directive include is static include is static include(becoz of code inclusion)
        where as Action include is Dynamic include (becoz of output inclusion).
        
        xml syntax::
        ----------------
        
            <jsp:include attributes/>
            
            attributes::
                      page:Specifies the dest web page/comp
                      flush::indicates wheather the source jsp web page's buffer should be flushed or not before including the output of dest web comp
                                   to the buffer of source jsp page(true/false) default is "false"
        









 --%>

























