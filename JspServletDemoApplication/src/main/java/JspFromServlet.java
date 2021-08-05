




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
        public class JspFromServlet extends HttpServlet {
			public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
			    rs.setContentType("text/html");
       	  		PrintWriter out = rs.getWriter();
				out.println("It's a servlet.</br>");
				rs.sendRedirect("JspFromServlet.jsp");
				}
			
			
}
