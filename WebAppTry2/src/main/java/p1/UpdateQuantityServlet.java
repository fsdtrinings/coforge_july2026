package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bl.BusinessOperations;

public class UpdateQuantityServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do GET method of UpdateQuantityServlet");
		int id = Integer.parseInt(req.getParameter("id"));
		int oldQuantity = Integer.parseInt(req.getParameter("q"));

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<html><body>");
		out.print("<form action='UpdateQuantityServlet' method='POST'>");
		out.print("Enter the New Quantity , Current Value of Stock in hand : "+oldQuantity); 
		out.print("<input type='number' name='newQuantity'> <br/>"); // 20
		out.print("<input type='hidden' value='"+id+"' name='id'> <br/>"); // 20
		out.print("<input type='submit' value='Update Qunatity'> <br/>");
				out.print("</form>");
		out.print("</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("do Post method of UpdateQuantityServlet");
		int id = Integer.parseInt(req.getParameter("id"));
		int quantity = Integer.parseInt(req.getParameter("newQuantity"));
	
		try {
			
			BusinessOperations ops = new BusinessOperations();
			
			boolean status = ops.doUpdateQuantity(quantity, id);
			
			if(status)
			{
				resp.sendRedirect("productservlet");
				
			}
			else
			{
				throw new Exception("unable to update for ID "+id );
			}
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
	
	
	}

}























