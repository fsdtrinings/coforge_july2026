package p1;

public class AnynoInnerClassDemo {

	public static void main(String[] args) {

		//new DevelopersCode().doTaskWithProduct(new Laptop());

		// -------------------------------------------------------------

		new DevelopersCode().doTaskWithProduct(new ElectronicProduct() {

			@Override
			public void switchOn() { 
				System.out.println("My Smart Switch on process");

			}

			@Override
			public void switchOff() { // TODO Auto-generated method stub
				System.out.println("My Smart Switch off process");
			}

			public void doMyThings() {

			}
		});
		
		
		// ----------------------------------
		
		
		
		

	}
}
