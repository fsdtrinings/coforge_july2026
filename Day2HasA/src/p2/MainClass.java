package p2;

import java.util.Scanner;

import p1.Employee;
import p1.FoodApp;
import p1.Project;

public class MainClass {
	
	public static void main(String[] args) {
	
		MainClass employeePortal = new MainClass();
		
		
		Employee e = new Employee(101, "Sawan", 2000); // login , after login extract employee info
		Project p = new Project("MyApp2", "Noida", "Coforge");
		e.setProject(p);
		
		employeePortal.employeeOrderingFood(e);
		
	}//end main
	
	public void employeeOrderingFood(Employee e)
	{
		System.out.println("Enter the Food Name "); // should select food from available menu
		String foodName = new Scanner(System.in).nextLine();
		
		// Employee e = new Employee(); // should not create new employee , it has default values
		FoodApp foodApp = new FoodApp();
		String orderNotification = e.doFoodOrderBooking(foodApp,foodName);
		
		if(orderNotification!=null)
		{
			System.out.println("Order booked "+orderNotification);
		}
		else
		{
			System.out.println("Contact to Food Court Admin");
		}
	}
	
	public void getEmployeeDetails()
	{
		// employee phoneNumber
		// employee email id
		// employee working for which client?
	}
	
	
}//end class
