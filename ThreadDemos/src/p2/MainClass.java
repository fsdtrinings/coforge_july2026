package p2;

public class MainClass {
	public static void main(String[] args) {
		
		
		HpPrinter hpPrinter = new HpPrinter();
		
		Users u1 = new Users("Ramesh", "Java Project", hpPrinter);
		Users u2 = new Users("Suresh", "sales doc", hpPrinter);
		Users u3 = new Users("Lokesh", "HR Report", hpPrinter);
		Users u4 = new Users("Kavita", "Finance Records", hpPrinter);
		
	}

}
