package p2;

public class Users implements Runnable{

	Thread t;
	String doc;
	String username;
	HpPrinter printerObj;
	public Users(String username,String doc, HpPrinter printerObj) {
		this.username = username;
		this.doc = doc;
		this.printerObj = printerObj;
		this.t = new Thread(this);
		this.t.start();
	}
	
	@Override
	public void run() {
		printerObj.doPrint(doc);
	}//end run
}//end class
