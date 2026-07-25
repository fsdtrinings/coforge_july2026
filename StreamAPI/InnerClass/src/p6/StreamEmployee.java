package p6;

import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import p3.Employee;

public class StreamEmployee {

	List<Employee> allEmployee;
	
	
	public StreamEmployee() {
	
		Employee e1 = new Employee(101, "Ramesh", 2000, "Noida");
		Employee e2 = new Employee(102, "suresh", 2500, "Noida");
		Employee e3 = new Employee(103, "mahesh", 12000, "Mumbai");
		Employee e4 = new Employee(104, "Kamlesh", 8900, "Mumbai");
		Employee e5 = new Employee(105, "Rajesh", 4600, "Noida");
		
		allEmployee = Arrays.asList(e1,e2,e3,e4,e5);
	}
	
	
	public static void main(String[] args) {
	
		StreamEmployee obj = new StreamEmployee();
		
		//obj.getMaxSalary();
		//obj.getMinSalary();
		
		
		Set<Employee> output = obj.doSalaryHikeBasedOnLocation("Mumbai");
		output.stream().forEach((e)->System.out.println(e));
		
	}//end main
	
	public Set<Employee> doSalaryHikeBasedOnLocation(String filterLocation)
	{
		/*
		 * Objective : to change the salary of the given location employees by 5%
		 *      and return the values of each (updated salary) employee to the front end
		 * 
		 * */
	
		
		return allEmployee.stream().filter((e)->{
			return e.getLocation().equals(filterLocation);
		}).map((e)->{
			int currentSalary = e.getSalary();
			currentSalary*=1.05;
			e.setSalary(currentSalary);
			return e;
		}).collect(Collectors.toSet());
		
		/*  Note : Collectors.toSet , instead of this we can use 
		 *     either List or Map
		 *     don't forget to change the return type accordingly 
		 *     */
		
		
	}
	public void getMaxSalary()
	{
		
		Comparator<Employee> com = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary() - e2.getSalary();
			}
		};
		
		Employee e = allEmployee.stream().max(com).get();
		System.out.println("Employee Max Salary "+e);
	}
	public void getMinSalary()
	{
		
		
		Employee e = allEmployee.stream().min((e1,e2)->{
				return e1.getSalary()-e2.getSalary();
		}).get();
						
		System.out.println("Employee Min Salary "+e);
	}
	
	
	
	
	
	
	
}//end class





















