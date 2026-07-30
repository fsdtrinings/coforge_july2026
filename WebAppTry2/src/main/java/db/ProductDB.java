package db;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class ProductDB {

	String host = "localhost:3306";
	String database = "cfg";
	String url = "jdbc:mysql://" + host + "/" + database;

	Connection con;
	PreparedStatement ps; // sql query

	public ProductDB() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading a driver class
		con = DriverManager.getConnection(url, "root", "root");
		System.out.println("con " + con);

	}
	public List<Product> getAllProductsByCategory(String category) throws SQLException {
		String sql = "select * from Product where category like ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, category);
		
		ResultSet rs = ps.executeQuery();
		List<Product> resultList = new ArrayList<>();
		while(rs.next())
		{
			
			int productId = rs.getInt("productId");
			String pname = rs.getString("productName");
			String productDescription = rs.getString("productDescription");
			int price = rs.getInt("price");
			int stockQuantity = rs.getInt("stockQuantity");
			String cat = rs.getString("category");
			
			Product tempProduct = new Product(productId,pname,productDescription,price,stockQuantity,category);
			resultList.add(tempProduct);
		}
		return resultList;
		
	}
	
	

	public boolean insertProduct(Product product) throws SQLException {
		String sqlQuery = "Insert into cfg.Product values(?,?,?,?,?,?)";

		ps = con.prepareStatement(sqlQuery);
		ps.setInt(1, product.getProductId());
		ps.setString(2, product.getProductName());
		ps.setString(3, product.getProductDescription());
		ps.setInt(4, product.getPrice());
		ps.setInt(5, product.getStockQuantity());
		ps.setString(6, product.getCategory());

		int rowsUpdated = ps.executeUpdate();
		return (rowsUpdated > 0) ? true : false;

	}

	public List<Product> getAllProducts() throws SQLException {
		String sql = "select * from cfg.Product";
		
		List<Product> allProducts = new ArrayList<>();

		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			// manually ...create product through values inside rs object

			int productId = rs.getInt("productId");
			String pname = rs.getString("productName");
			String productDescription = rs.getString("productDescription");
			int price = rs.getInt("price");
			int stockQuantity = rs.getInt("stockQuantity");
			String category = rs.getString("category");
			
			Product tempProduct = new Product(productId,pname,productDescription,price,stockQuantity,category);
			allProducts.add(tempProduct);
		
		}

		return allProducts;
	}

}// end class
