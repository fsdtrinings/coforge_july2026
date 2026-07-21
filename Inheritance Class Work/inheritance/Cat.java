package inheritance;

public class Cat extends Animal {
	
	private int catPoints;

	public Cat() {
		super();

	}

	public Cat(int age, int weight) {
		super(age, weight);
	}
	
	public Cat(int age, int weight,int pointsEarned) {
		super(age, weight);
		super.setPoints(pointsEarned);
	}
	
	// ----------------------------------'
	
	
	public void doHuntRat()
	{
		if(super.getWeight()>12)
		{
			System.out.println("Cat play games");
			int basePoints = super.getPoints();
			super.setPoints(basePoints + 3);
			int energyLost = 2;
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
		
		System.out.println("Cat eats food");
		int kal = 2;
		int baseWeight = super.getWeight();
		super.setWeight(baseWeight+kal);
		
		System.out.println(" Cat Weight "+super.getWeight());
		
		
	}
	
	
}
