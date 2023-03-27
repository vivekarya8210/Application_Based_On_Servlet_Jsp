package com.nt.image;

import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ImageServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public ImageServlet() {
		super();

	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\MImgs\\indiamap.jpg");

		int n = fis.available(); // it return file size

		byte[] b = new byte[n]; // memory allocated in ram a/c to file size

		fis.read(b); // it will read the image from file

		ServletOutputStream sos = response.getOutputStream(); // It create a stream from server to browser

		sos.write(b); // it will write image to stream
		sos.println("</body></html>");
		

	}

}
