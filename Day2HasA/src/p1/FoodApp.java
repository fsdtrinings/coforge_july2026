package p1;

public class FoodApp {

	private FoodItem foodItem;
	private int counterNumber;
	public FoodApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodApp(FoodItem foodItem, int counterNumber) {
		super();
		this.foodItem = foodItem;
		this.counterNumber = counterNumber;
	}
	public FoodItem getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}
	public int getCounterNumber() {
		return counterNumber;
	}
	public void setCounterNumber(int counterNumber) {
		this.counterNumber = counterNumber;
	}
	@Override
	public String toString() {
		return "FoodApp [foodItem=" + foodItem + ", counterNumber=" + counterNumber + "]";
	}
	
	
	
}
