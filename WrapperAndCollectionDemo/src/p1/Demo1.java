package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Dog{}

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		/*
		list.add(new Double(45.6));
		list.add(new Dog());
		list.add(45);
		list.add(45);
		list.add(45);
		list.add(true);
		list.add("Ramesh Kumar");
		*/
		
		
		list.add(45);
		list.add(145);
		list.add(465);
		list.add(345);
		list.add(245);
		list.add(459);
		
		// # approach 1 
		System.out.println(list.get(3));
		

		// # approach 2 
		System.out.println("\n=========================\n");
		for(int i = 0;i<list.size();i++)
		{
			int data = list.get(i);
			System.out.println(data);
		}
		
		// # approach 3
		System.out.println("\n=========================\n");
		for (Integer data : list) {
			System.out.println(data);
		}
		
		// # approach 4 iterator
		System.out.println("\n=========================\n");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			int data = itr.next();
			System.out.println(data);
		}
		
		
		
		
	}
	
	 
}


























