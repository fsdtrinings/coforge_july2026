package p5;

import java.util.TreeSet;
import java.util.Set;

public class BasicSorting {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();

		set.add(8);
		set.add(118);
		set.add(47);
		set.add(69);
		set.add(10);
		set.add(5);

		
		
		for (Integer data : set) {
			System.out.println(data);
		}

	}
}
