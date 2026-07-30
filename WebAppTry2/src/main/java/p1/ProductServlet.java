package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import bl.BusinessOperations;

public class ProductServlet extends HttpServlet{

	
	
	
	public ProductServlet() {
		System.out.println("Product Servelt constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		System.out.println("inside doGet of Product servlet");
		try {

			BusinessOperations ops = new BusinessOperations();
			
			List<Product> allProducts = ops.getAllProducts();
			
			System.out.println("All Products "+allProducts.size());
			
			
			
			
			out.print("<HTML><BODY>");
			
			out.print("<TABLE>");
			
				allProducts.stream().forEach((p)->{
						out.print("<tr>");
						
						out.print("<td> "+p.getProductId()+"</td>");
						out.print("<td> "+p.getProductName()+"</td>");
						out.print("<td> "+p.getPrice()+"</td>");
						out.print("<td> "+p.getStockQuantity()+"</td>");
						out.print("<td> <a href='StockUpdateServlet?id="+p.getProductId()+"'/>update</td>");
						out.print("<td> <a href='DeleteServlet?id="+p.getProductId()+"'/>delete</td>");
						
							
						out.print("</tr>");
				});
			
			out.print("</TABLE></BODY></HTML>");
			
			
			
		} catch (Exception e) {

			System.out.println(e);
			out.print(e);
			// some code to handle error page
		}
		
	}

}
