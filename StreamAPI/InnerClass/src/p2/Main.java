package p2;

public class Main {
	public static void main(String[] args) {
		
		DLFHome dlf = new DLFHome();
		
		NoidaHome a1 = new NoidaHome();
		a1.addFeatures(dlf);
		
		// -------------------------------------------------
		
		NoidaHome a123 = new NoidaHome();
		a123.addFeatures(new MyHomeInterface() {
			
			@Override
			public String mySmartHome() {
				return "Smart Gas line";
			}
		});
		
		// -----------------------------
		
		NoidaHome a24 = new NoidaHome();
		a24.addFeatures(()->{
			int cost = 5000;
			return "Smart Water System "+cost;
		});
	}
}





