package imageservlet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/image")
public class ImageServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Arya\\loc.jpg");
		int n=fis.available();
		byte[] b=new byte[n];
		fis.read(b);
		ServletOutputStream sos=response.getOutputStream();
		sos.write(b);
	}

}
