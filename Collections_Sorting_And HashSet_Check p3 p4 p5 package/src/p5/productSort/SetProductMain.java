package p5.productSort;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import p3.Product;

public class SetProductMain {

	public static void main(String[] args) {
		
		Set<Product> allProducts = new TreeSet<>();
		
		Product p1 = new Product("Dell", 2000, "Laptop");
		Product p6 = new Product("Dell", 2000, "Laptop");
		
		Product p2= new Product("Dell", 2500, "Laptop");
		Product p3 = new Product("HP", 3000, "Laptop");
		Product p4 = p1;
		Product p5 = new Product("Bell", 2500, "Laptop");
		Product p7 = new Product("Nikon", 25000, "Camera");
		Product p8 = new Product("ZNikon", 25000, "Camera");
		
		
		
		
		allProducts.add(p1);
		allProducts.add(p2);
		allProducts.add(p3);
		allProducts.add(p4);
		allProducts.add(p5);
		allProducts.add(p6);
		allProducts.add(p7);
		allProducts.add(p8);
		
		
		
		
		

		System.out.println("\n===============================\n\n");
		
		for (Product product : allProducts) {
			System.out.println(product);
		}
		
		// =========== calling of sorting code ===========================
		
		printProductsByCostLowtoHigh(allProducts);
		printProductsByCostHighToLow(allProducts);
	}//end main
											//  get the list/set which i have to sort
	public static void printProductsByCostLowtoHigh(Set<Product> s)
	{
		 
		// code to sort the collection
		
		List<Product> list = new ArrayList<>(s);
		SortProductByCostLowToHigh sortCode = new SortProductByCostLowToHigh();
		Collections.sort(list, sortCode);
		
		
		// print the collection 
		System.out.println("--- Product Low to high ---");
		for (Product product : list) {
			System.out.println(product);
		}
		
	}
	
	public static void printProductsByCostHighToLow(Set<Product> s)
	{
		 
		// code to sort the collection
		
		List<Product> list = new ArrayList<>(s);
		SortProductByCostHighToLow sortCode = new SortProductByCostHighToLow();
		Collections.sort(list, sortCode);
		
		
		// print the collection 
		System.out.println("--- Product High to Low ---");
		for (Product product : list) {
			System.out.println(product);
		}
		
	}
	
	
	
	
}//end class






