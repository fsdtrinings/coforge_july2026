package inheritance;


class A
{

	public A() {
		super();
		System.out.println("A");
	}
	
}
class B extends A
{
	B(int x)
	{
		System.out.println("B");
	}
}
class C extends B
{
	C()
	{
		super(44);
		System.out.println("C");
	}
}


public class Basic {

	public static void main(String[] args) {
		
		C obj = new C();
		
		A obj2 = new C(); // Super class ref , can store sub class Object
		
		
	}
}














