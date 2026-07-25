package p1;

public interface ElectronicProduct {

	public void switchOn();
	public void switchOff();
}


class AC implements ElectronicProduct
{

	int temp = 0;
	@Override
	public void switchOn() {
		System.out.println("Use AC remote and Switch on");
	}

	@Override
	public void switchOff() {
		if(temp<17)
		{
			System.out.println(" Device Switch Off");
		}
		else
		{
			System.out.println(" Press Power  - off Button");
		}
		
	}
	
	
	public void startTurboFan()
	{
		temp = temp - 5;
		System.out.println("Fast the Fan Speed "+temp);
	}
}


class Laptop implements ElectronicProduct
{

	@Override
	public void switchOn() {
		System.out.println("Connect Charger and Switch on the Device");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Use Shutdown or Power-off button");
		
	}
	
	public void doTeansMeeting()
	{
		System.out.println("Login MS-Team and Connect the meeting");
	}
}
