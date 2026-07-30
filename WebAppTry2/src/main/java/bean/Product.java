package bean;


import java.io.Serializable;
import java.util.Objects;

public class Product implements Comparable<Product> , Serializable {
	
	private int productId;
	private String productName;
	private String productDescription;
	private int price;
	private int stockQuantity;
	private String category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productDescription, int price, int stockQuantity,
			String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.category = category;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, price, productDescription, productId, productName, stockQuantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(productDescription, other.productDescription) && productId == other.productId
				&& Objects.equals(productName, other.productName) && stockQuantity == other.stockQuantity;
	}
	
	
	
	@Override
	public int compareTo(Product p) {
		return p.getProductId() - this.productId;
	}
	@Override
	public String toString() {
		return productId+" "+productName+" "+price+" "+category;
	}
	
	
	
	

}
