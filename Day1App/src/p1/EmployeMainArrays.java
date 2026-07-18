package p1;

import java.util.Iterator;
import java.util.Scanner;

public class EmployeMainArrays {
	
	Employee allEmployees[] = new Employee[3]; // DB
	
	public static void main(String[] args) {
		
		EmployeMainArrays app = new EmployeMainArrays();
		
				
		Employee e1 = new Employee("ramesh","ramesh@gmail.com");
		Employee e2 = new Employee("suresh","suresh@gmail.com");
		Employee e3 = new Employee("mahesh","mahesh@gmail.com");
		
		app.allEmployees[0] = e1; // insert
		app.allEmployees[1] = e2;
		app.allEmployees[2] = e3;
		
	
		for (Employee employee : app.allEmployees) {
			System.out.println(employee.getId()+" "+employee.getName());
		}
		
		System.out.println("Enter Employee ID for Change Salary Operation ");
		app.changeSalaryByEmployeeId(new Scanner(System.in).nextInt());
		
		app.allocateProjectByEmployeeID(new Scanner(System.in).nextInt());
		
	}//end of main method
	
	public void changeSalaryByEmployeeId(int searchID){
	
		boolean isFound = false;
		for (Employee employee : allEmployees) {
			if(employee.getId() == searchID)
			{
				employee.doSalaryHike(4);
				isFound = true;
				System.out.println("Updated Salary "+employee.getSalary());
			}
		}//end of for
		
		
		if(!isFound)
		{
			System.out.println("Pls. enter the Employee ID again");
		}
		
	}

	
	
	public void allocateProjectByEmployeeID(int searchID)
	{
		
	}
}//end of class
















