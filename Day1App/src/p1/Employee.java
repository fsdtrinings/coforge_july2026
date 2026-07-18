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
	 
	public Employee() {
		id = 0;
		name = "";
		
	}
	
	public Employee(String name,String username)
	{
		Random r = new Random();
		id = r.nextInt(100,500); // random Id 
		this.name = name;
		this.username = username;
		this.salary = 2000;
		
		
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
	public int getId() {
		return id;
	}
	public void setId(int x) {
		this.id = x;
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
	 
	 
	public void doTransaferSalary()
	{
		
	}
	
	public void doSalaryHike(int per)
	{
		int incrementAmount = (salary*per)/100;
		salary+=incrementAmount;
	}
	
	public void doLogin(String username,String password)
	{
		System.out.println("Backend code to verify username & passowrd ");
		if(username.equalsIgnoreCase(this.username) && password.equalsIgnoreCase(this.password))
		{
			System.out.println(" Welcome "+name+" ["+LocalDate.now()+"]");
		}
	}
	

}



