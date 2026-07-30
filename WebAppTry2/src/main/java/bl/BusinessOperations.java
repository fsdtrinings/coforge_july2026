package bl;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import bean.Product;
import db.ProductDB;

public class BusinessOperations {

	ProductDB db ;
	
	public BusinessOperations() throws Exception
	{
		db = new ProductDB();
	}
	
	
	public List<Product> getAllProductsByCategory(String category)throws Exception
	{
		/* min code */
		
		return db.getAllProductsByCategory(category);
	}
	
	
	
	public List<Product> getAllProducts()throws Exception
	{
		String checkUserRole = "valid";
		String loadUserProfile = "valid";
		
		return db.getAllProducts();
		
		
	}
	
	
	
	public boolean submitProduct(Product product)throws SQLException
	{
		if(product != null)
		{
			// to generate id ( random)
			int productid = new Random().nextInt(45000,90000);
			
			product.setProductId(productid);
			product.setProductDescription(" no info ");
			return db.insertProduct(product);
			
		}
		
		return false;
	}
}
