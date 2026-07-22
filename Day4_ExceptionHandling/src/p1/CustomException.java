package p1;


class MyException extends Exception
{
	@Override
	public String toString() {
		return "MyException executed";
	}
}
public class CustomException {
	public static void main(String[] args) {
		CustomException obj = new CustomException();
		try {
			obj.doABCTask();
		} catch (MyException e) {
			System.out.println(e);
		}
	}
	public void doABCTask()throws MyException
	{
		System.out.println("working on abc");
		throw new MyException();
	}
}
