package p4;

import java.util.Arrays;
import java.util.List;

public class StreamAPIBasicDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(47,63,0,47,160,200,78,20);
		
		list.stream().forEach((data)->{
			System.out.print(data+" ");
		});
		
		
		int max =  list.stream()
				        .max((a,b)->{
				        		return a-b;
				        	})
				        .get();
		
		
		System.out.println("\n\n MAX Value : "+max);
		
		
		
		// ====================
		
		
		
		
		// ----------------------------------------------------------
		System.out.println(" ----- Filter code ------");
		list.stream().filter((data)->{
			return data!=0;
		}).forEach((data)->{
			System.out.print(data+" ");
		});
		
		// ------------------------------
		
		
		
	}
}

















