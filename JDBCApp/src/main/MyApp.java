package main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import bean.Product;
import bl.BusinessOperations;
import db.ProductDB;

public class MyApp {

	Scanner sc = new Scanner(System.in); // scanner for non-string inputs
	Scanner scStr = new Scanner(System.in);

	BusinessOperations server;

	public MyApp() {
		try {
			server = new BusinessOperations();
		} catch (Exception e) {
			System.err.println(" **** Server Down ... contact to Customer Care " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		MyApp app = new MyApp();

		while (true) {

			try {
				System.out.println(" ======== MENU ======");
				System.out.println("1. Insert Product");
				System.out.println("2. Get Product By Name");
				System.out.println("3. Get Product By Category");
				System.out.println("4. Get All Products");
				System.out.println("0. EXIT");

				System.out.println(" Enter Menu Number :> ");
				switch (new Scanner(System.in).nextInt()) {
				case 1: {
					app.takeUserInputForProduct();
					break;
				}
				
				case 3: {
					app.getAllProductsByCategory();
					break;
				}
				
				
				case 4: {
					app.getAllProducts();
					break;
				}
				

				default:
					System.err.println("Invalid Option...");
					System.exit(0);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		} // end while

	}// end main

	public void displayProduct(List<Product> list, String tag)
	{
		System.out.println(" \n\n ---------- "+tag+" --------\n");
		list.stream().forEach((p)->{
			System.out.println(p+"\n");
		});
	}
	
	
	public void getAllProductsByCategory()throws Exception
	{
		
		
		System.out.println("Enter product Category ");
		String category = scStr.nextLine();

		
		
		List<Product> allProducts = server.getAllProductsByCategory(category);
		
		displayProduct(allProducts,"Product By Category");
		
		
		
	}
	
	
	public void getAllProducts()throws Exception
	{
		
		List<Product> allProducts = server.getAllProducts();
		
		displayProduct(allProducts," All Products");
		
		
		
	}
	
	
	public void takeUserInputForProduct() throws SQLException {
		System.out.println("Enter product name ");
		String pname = scStr.nextLine();

		System.out.println("Enter product Category ");
		String category = scStr.nextLine();

		System.out.println("Enter product Price ");
		int price = sc.nextInt();

		System.out.println("Enter product Stock In hand ");
		int stockQuantity = sc.nextInt();

		Product p = new Product(0, pname, null, price, stockQuantity, category);

		boolean status = server.submitProduct(p);

		if(status) System.out.println("Product Submit...");
		else System.err.println("!!!Error during Data Insertion");
	}

}// end class
