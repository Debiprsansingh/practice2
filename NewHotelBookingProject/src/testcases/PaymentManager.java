package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class PaymentManager 
{

	@Test
	public void applyDiscount()
	{
		System.out.println("apply discount");
	}
	
	@Parameters({"action"})
	@Test
	public void makePayment(String paymentType, ITestContext context)
	{
		if(paymentType.equals("instantpay"))
		
		System.out.println("making instant payment");
		else
			System.out.println("pay@hotel booking");
		//Booking ID
		String bookingID="akash123";
		context.setAttribute("bookingid", bookingID);
		System.out.println("bookingid in makepayment function: " +bookingID);
		
	}
	
	
	
	
}
