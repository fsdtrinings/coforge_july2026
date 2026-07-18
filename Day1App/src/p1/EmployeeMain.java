package p1;

public class EmployeeMain {

	
	public static void main(String[] args) {
	
		
		
		Employee e = new Employee();
		e.setUsername("Ramesh123");
		e.setPassword("abc");
		e.setName("Ramesh Kumar");
		e.setSalary(2000);
		

		
		String username = "Ramesh"; // must be entered through external system
		String password = "abc252";
		e.doLogin(username, password);
		
		
		System.out.println("Before Increment : "+e.getSalary());
		
		e.doSalaryHike(4);
		
		System.out.println("After Increment : "+e.getSalary());
		
	}//end main
	
	
	
	
}//end main class
