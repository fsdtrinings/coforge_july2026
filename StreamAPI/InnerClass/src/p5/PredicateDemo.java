package p5;

import java.util.function.Predicate;

public class PredicateDemo 
{
	public void doTest()
	{
		
		Predicate<Integer> p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t>50;
			}
		};
		
		
	}

}
