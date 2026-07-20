package p1;

import java.time.LocalDate;
import java.util.Random;

public class Employee {

	
	 private int id;
	 private String name;
	 private String department;
	 private int salary;
	 private String username;
	 private String password;
	 
	  
	 private Project project;
		 
	 
	 public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", username=" + username + ", password=" + password + ", project=" + project + "]";
	}
	 
	
	 public String doFoodOrderBooking(FoodApp foodApp,String requestedItem)
	 {
		
		 FoodItem orderedFood = new FoodItem(requestedItem, 150); // 150 is the price , must extract from DB
		 
		 int foodCounter = new Random().nextInt(1, 10); // should be linked with the system
		 
		 foodApp.setFoodItem(orderedFood);
		 foodApp.setCounterNumber(foodCounter);
		 
		 if(foodApp!=null) // should be based on database entry status
		 {
			 return "Item Name "+requestedItem+" Price Paid "+foodApp.getFoodItem().getPrice()+" CounterNumber "+foodCounter;
		 }
	 
		 return null;
	 }
	

}



