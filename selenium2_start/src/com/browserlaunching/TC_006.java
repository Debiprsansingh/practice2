package com.browserlaunching;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{	
	private static final Logger log= Logger.getLogger(TC_006.class);
	
	
		public static void main(String[] args) throws Exception 
		{
			initiate();
			log.info("intitiate properties file");
			
			
			launch("chromebrowser");
			log.info("launch the browser :-" + p.getProperty("chromebrowser"));
			/*
			 * test.log(Status.PASS, "opened browser:-" + p.getProperty("chromebrowser"));
			 */
			
			navigateUrl("amazonUrl");
			log.info("the url is:-" + childprop.getProperty("amazonUrl"));
			//driver.findElement(By.linkText("Customer Service")).click();
			//driver.findElement(By.partialLinkText("Customer Ser")).click();
			
			  List<WebElement> web = driver.findElements(By.tagName("a"));
			  
			  for(int i=0;i< web.size();i++) 
			  { 
				  if(!web.get(i).getText().isEmpty()) 
			  {
					  
			  System.out.println(web.get(i).getText());
			
			  	}
			  }
			System.out.println("--------------------------------------------------------------");
			
			
			 List<WebElement> web1 = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
			  
			  for(int j=0;j<web1.size();j++)
			  {
				  if(!web1.get(j).getText().isEmpty())
				  {
					  System.out.println(web1.get(j).getText());
				  }
				  
			  }
		
		
		}

}
