

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class FirstGeneric
 */
@SuppressWarnings("serial")
public class FirstGeneric extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("FirstGeneric in service method");
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Welcome - BATCH 2022</b>");  
		out.print("</body></html>");
	}
}
