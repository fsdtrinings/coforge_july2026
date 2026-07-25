package p2;

public interface MyHomeInterface {
	public String mySmartHome();
}
class NoidaHome
{
	public void addFeatures(MyHomeInterface home)
	{
		System.out.println(home.mySmartHome());
	}
}



class DLFHome implements MyHomeInterface
{

	@Override
	public String mySmartHome() {
		return "DLF - Home";
	}
	
}

// -----------------------
interface Animal
{
 public String doEat();	
}

class Dog
{
  public void doFeed(Animal a)
  {
	  String foodName = a.doEat();
  }
}
