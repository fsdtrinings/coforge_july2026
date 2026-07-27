package p1;
import java.util.Iterator;
class MyThread extends Thread
{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i = 1;i<20;i++)
		{
			System.err.println(name+" "+i);
		}
	}
}
public class BasicThreadApp {
	public static void main(String[] args) {
			Thread.currentThread().setName("Main Thread");
			MyThread t = new MyThread();
			t.setName(" MyThread");
			t.start();
			String name = Thread.currentThread().getName();
			for(int i = 1;i<20;i++)
			{
				System.out.println(name+" "+i);
			}
	}
}
