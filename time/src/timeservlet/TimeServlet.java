package timeservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TimeServlet
 */
@WebServlet("/time")
public class TimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		Date d = new Date();
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=yellow text=blue><h1>");
		pw.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		pw.println("</h1></body></html>");	
				
	}

}
