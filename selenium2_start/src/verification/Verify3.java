package verification;

import com.aventstack.extentreports.Status;
import com.browserlaunching.BaseTest;

public class Verify3 extends BaseTest

{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		initiate();
		test=report.createTest("Verify3");
		test.log(Status.INFO, "initiating init method");
		
		launch("chromebrowser");
		test.log( Status.PASS ,"launching chrome "  +p.getProperty("chromebrowser")+" browser");
		
		navigateUrl("amazonUrl");
		test.log(Status.INFO, "navigating to amazon website");
		
		
		
		String expectedlinks="Customer Serv";
		
		if(!islinkEqual(expectedlinks))
			
			reportfailure("Both strings are not equal");
			//System.out.println("strings are not equal");
		
		else
			reportsuccess("both strings are equal");
			//System.out.println("strings are equals");
		
		
		report.flush();

	}

	

	
	}


