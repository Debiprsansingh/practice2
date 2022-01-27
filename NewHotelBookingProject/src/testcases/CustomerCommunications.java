package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunications 
{
	@Test
	public void checkEmailVerfication(ITestContext context)
	{
		System.out.println("checking mail verification");
		String bookingid = (String)context.getAttribute("bookingid");
		System.out.println("checking mail confirmation: "+bookingid);
		
	}
	
	@Test
	public void checkMobileVerification(ITestContext context)
	{
		System.out.println("checking verification in mobile");
	}
}
