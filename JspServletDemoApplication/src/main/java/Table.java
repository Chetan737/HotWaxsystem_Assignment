


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
        public class Table extends HttpServlet {
			public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
			    rs.setContentType("text/html");
       	  		String number=rq.getParameter("number");
       	  		
				PrintWriter out=rs.getWriter();
				try{
				int n = Integer.parseInt(number);
				out.println("It's a servlet.</br>");
				out.println("	 "+n+"</br>");
				for(int i=1;i<=10;i++)
				{
					
					out.println(Integer.toString(n*i)+"</br>");

					//System.out.println(n*i);    
				} 
				}
				catch(NumberFormatException e)
				{
					out.println("Enter a valid no.s");
				}
            
            
        }
}
