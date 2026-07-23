package p4.setproductDemos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import p3.Product;

public class SetProductMain {

	public static void main(String[] args) {
		
		int x = 10;
		if(x == 10) {}
		
		
		Set<Product> allProducts = new HashSet<>();
		
		
		Product p1 = new Product("Dell", 2000, "Laptop");
		Product p6 = new Product("Dell", 2000, "Laptop");
		
		Product p2= new Product("Dell", 2500, "Laptop");
		Product p3 = new Product("HP", 3000, "Laptop");
		Product p4 = p1;
		Product p5 = new Product("Bell", 2500, "Laptop");
		Product p7 = new Product("Nikon", 25000, "Camera");
		
		
		
		allProducts.add(p1);
		allProducts.add(p2);
		allProducts.add(p3);
		allProducts.add(p4);
		allProducts.add(p5);
		allProducts.add(p6);
		allProducts.add(p7);
		

		

		System.out.println("\n===============================\n\n");
		
		for (Product product : allProducts) {
			System.out.println(product);
		}
		
		
		
		
		
		
		
		
	}
}
