
<%--
   k)isThreadSafe  (default value="true")
    ---------------
        =>Makes the JES class of jsp page as thread safe by implementing SingleThreadModel(I) 
      
      
       e.g::1<%page isThreadSafe="false"%>    (Meaning is reverse)
       
                 => Makes the JES class of jsp page implementing javax.servlet.SingleThreadModel(I)
                  to make the JES class thread safe having container support.
       e.g::2<%page isThreadSafe="true"%>    (Meaning is reverse)

            =>   Makes the JES class of jsp page not implementing javax.servlet.SingleThreadModel(I)
                 so we need to use synchronized blocks explicitly in the code of scriplet tags.
--%>
<%@page isThreadSafe="false"%>

 

<b>Hello</b>




