package p2;

import java.util.Scanner;

public class MainClass {
	
	BusinessOperations ops = new BusinessOperations();
	
	public static void main(String[] args) {
		MainClass app = new MainClass();
		try {
			int result = app.getElementFromList();
			System.out.println(result+" available in the list");
		} catch (ItemNotFoundException e) {
			System.out.println(e);
		}
		
	}
	
	public int getElementFromList()throws ItemNotFoundException
	{
		System.out.println("Enter the Search Element : ");
		int x = new Scanner(System.in).nextInt();
		
		return ops.filterData(x);
		
	}

}
