package com.browserlaunching;

import org.apache.log4j.Logger;

	
	public class TC_004 extends BaseTest 
	{
		private static final Logger log = Logger.getLogger(TC_004.class);

		public static void main(String[] args) throws Exception {
			
			initiate();
			log.info("intialising the init method");
			
			launch("firefoxbrowser");
			log.info("launch the " + p.getProperty("firefoxbrowser")+"browser");
			
			navigateUrl("amazonUrl");
			log.info("launching the URL"+ childprop.getProperty("amazonUrl"));
			
			selectOption("searchamazonDropbox_id","books");
			log.info("searching the books by using locator :-" + or.getProperty("searchamazonDropbox_id"));
			
			typeText("amazonsearchtextbox_name", "harry potter");
			log.info("entering harry potter by using locator :" + or.getProperty("amazonsearchtextbox_name"));
			
			typeText("amazonsearchtextbox_name", "harry potter");
			log.info("clicking on search button :-" + or.getProperty("amazonsearchButton_xpath"));
			
			
						
			
			//driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
			//driver.findElement(By.name("field-keywords")).sendKeys("harrypotter");
			//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		}

	

}
