package inheritance;

public class Dog extends Animal{

	private String name;
	// ----------------------------------
	private int dogPoints;
	
	
	public Dog() {
	}


	public Dog(int age, int weight,String name, int dogPoints) {
		super(age, weight);
		this.dogPoints = dogPoints;
	}

	/*   specific method to Dog*/
	public void doPlayGames()
	{
		
		if(super.getWeight()>20)
		{
			System.out.println("Dog play games");
			int basePoints = super.getPoints();
			super.setPoints(basePoints + (++dogPoints));
			int energyLost = 3;
			int currentWeight = super.getWeight();
			super.setWeight(currentWeight- energyLost);
		}
		else
		{
			System.out.println("Feed the Dog");
		}
		
		System.out.println("Point "+super.getPoints());
		
	}

	@Override
	public void doEat() {
		
		System.out.println("Dog eats food");
		int kal = 4;
		int baseWeight = super.getWeight();
		super.setWeight(baseWeight+kal);
		
		System.out.println(" Dog Weight "+super.getWeight());
		
		
	}
	
	
	
}
