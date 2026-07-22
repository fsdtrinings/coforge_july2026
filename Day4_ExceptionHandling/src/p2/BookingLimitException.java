package p2;

public class BookingLimitException extends Exception{

	int count;

	public BookingLimitException(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Cannot Book "+count+" Tickets , Contact to Customer Care , Click Here ";
	}
	
	
	
	
}
