package inheritance;

public class AppRunner {

	public static void main(String[] args) {
		AppRunner app = new AppRunner();
		                // age,weight   , dogPoint 
		Animal a = new Dog(2,4,"Tommy",1);
		
		app.gameStart(a);
		
		// --------- Animal upgraded ----------------
		int pointsEarned = a.getPoints();
		a = new Cat(2, 9, pointsEarned);
		app.gameStart(a);
	}
	
	public void gameStart(Animal a)
	{
	
		a.doEat();
		a.doEat();
		a.doEat();
		a.doEat();
		a.doEat();
		a.doEat();
		
		if( a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.doPlayGames();
			d.doPlayGames();
			d.doPlayGames();
		}
	
		if( a instanceof Cat)
		{
			Cat c = (Cat)a;
			a.doEat();
			a.doEat();
			a.doEat();
			
			c.doHuntRat();
			c.doHuntRat();
			c.doHuntRat();
			c.doHuntRat();
			
		}
		
		
		
		
	}
}





















