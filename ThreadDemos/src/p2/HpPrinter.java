package p2;

public class HpPrinter {
	
	public void doPrint(String doc)
	{
		System.out.println("A");
		
		synchronized (this) {
			System.out.println("[");
			System.out.println(""+doc);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			
			System.out.println("]");
		}
	
		System.out.println("B");
		
		
	}
}
