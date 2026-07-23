package p2;

public class ItemNotFoundException extends Exception
{
	int item;

	public ItemNotFoundException(int item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemNotFoundException [item=" + item + "]";
	}
	
	
	
}
