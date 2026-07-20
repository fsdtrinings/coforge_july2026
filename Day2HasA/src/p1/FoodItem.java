package p1;

public class FoodItem {
	
	private String foodName;
	private int price;
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItem(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem [foodName=" + foodName + ", price=" + price + "]";
	}
	
	

}
