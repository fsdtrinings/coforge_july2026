package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		 
		resp.setContentType("text/html"); 
		PrintWriter out = resp.getWriter();
		
		out.print("<html><body>");
			out.print("<form action='home' method='POST'>");
			out.print("<input type='number' name='num1'>"); // 10
			out.print("<input type='number' name='num2'>"); // 20
			out.print("<input type='submit'>");
			
			out.print("</form>");
		out.print("</body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		 System.out.println("post method called");
	 
		 int num1 = Integer.parseInt(request.getParameter("num1"));
		 int num2 = Integer.parseInt(request.getParameter("num2"));
		 
			resp.setContentType("text/html"); 
			PrintWriter out = resp.getWriter();
			
		 int sum = num1+num2;
		out.println(num1+" + "+num2+" = "+sum);
		
		
		
			
	}

}













