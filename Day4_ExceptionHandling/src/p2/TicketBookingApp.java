package p2;

import java.util.Random;
import java.util.Scanner;

public class TicketBookingApp {
	public static void main(String[] args) {
		
		TicketBookingApp app = new TicketBookingApp();
		
		int countRequestFromClient = app.appUIToReadUserData();
		
		try {
			String status = app.serverBackendCodeToBookTicket(countRequestFromClient);
			
			System.out.println(status); // notification over phone , whatsapp , email , msg , pushNotification
		} catch (BookingLimitException e) {
			System.out.println(e);
		}
		
		
		
	}
	
	
	public int appUIToReadUserData() // mobile app code
	{
		System.out.println("Enter the Ticket Count : ");
		int count = new Scanner(System.in).nextInt();
		return count;
	}
	
	public String serverBackendCodeToBookTicket(int countRequestFromClient)
			 throws BookingLimitException
	{
		if(countRequestFromClient<6)
		{
			int random = new Random().nextInt(1508450,7800000);
			return (countRequestFromClient+" Ticket Booked , Transaction Num "+random);
			
		}
		else
		{
			throw new BookingLimitException(countRequestFromClient);
		}
		
	}

}






