package p4.setdemos;

import java.util.HashSet;
import java.util.Set;

public class SetBasicDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(78);
		set.add(78);
		set.add(78);
		set.add(69);
		set.add(10);
		set.add(5);
		
		for (Integer data : set) {
			System.out.println(data);
		}
		
	}
}
