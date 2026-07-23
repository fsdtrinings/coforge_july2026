package p3;

import java.time.LocalDate;
import java.util.Objects;

public class Product  implements Comparable<Product>  {

	private String productName;
	private int cost;
	private String category;
	private int raiting;
	private LocalDate packingDate;
	
	public Product() {
		
	}
	public Product(String productName, int cost, String category) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.category = category;
	}
	
	public Product(String productName) {
		super();
		this.productName = productName;
	}
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return productName+" "+cost+" "+category;
	}
	
	@Override
	public int hashCode() {
		System.out.println(" calling hashcode for "+productName);
		return productName.length()+cost;
	}
	
	@Override            // Animal obj
	public boolean equals(Object obj) {
		System.out.println(" ---->> calling equals for "+productName);
		Product p = (Product)obj;
		boolean a = (this.productName.equals(p.productName));
		boolean b = (this.category.equals(p.category));
		boolean c = (this.cost ==  p.cost);
		return a&&b&&c;
	}
	
	
	@Override
	public int compareTo(Product p) {
		
		// return p.cost - this.cost; // if default costing is based on cost
		return p.productName.compareTo(this.productName);
	}
	

	
	
	
	
}//end class
















