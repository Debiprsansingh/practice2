package com.browserlaunching;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;



public class TC_002 extends BaseTest {
	
	private static final Logger log=Logger.getLogger(TC_002.class);
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		initiate();
		log.info("inttialising the properties file....");
		
		 // test=report.createTest("TC_006"); test.log(Status.INFO,
		 // "initialising the properties files");
		 
		
		launch("chromebrowser");
		log.info("opening the "+p.getProperty("chromebrowser")+"browser");
		
		navigateUrl("amazonUrl");
		log.info("browsing the url :-" + childprop.getProperty("amazonUrl"));
		
		String str =driver.getTitle();		
		System.out.println(str);
		
		String a=driver.getCurrentUrl();
		System.out.println(a);
		
		driver.manage().window().maximize();
		
		String s=driver.getWindowHandle();
		System.out.println("window id is: " +s);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.close();
		driver.quit();
		
		
	}

}
