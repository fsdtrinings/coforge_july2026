package p1;
  //    Dog               Animal
class Thread2 implements Runnable
{
	
	public Thread2() {
		new Thread(this,"Runnable Thread").start();
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i = 1;i<20;i++)
		{
			System.err.println(name+" "+i);
		}
	}
	
}


public class RunnableDemo
{

	public static void main(String[] args) {
		
		Thread.currentThread().setName("Main Thread");
		
		Thread2 runnableObj = new Thread2();
				
		
		String name = Thread.currentThread().getName();
		for(int i = 1;i<20;i++)
		{
			System.out.println(name+" "+i);
		}
		
	}
}












