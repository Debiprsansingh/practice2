package webdriverscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy5 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(int i=0;i<links.size();i++)
		{
			if (!links.get(i).getText().isEmpty())
			
				

			{
				Date d= new Date();
				String dt=d.toString().replace(' ','_').replace(':','_');
				
				String linkname=links.get(i).getText();
				links.get(i).click();
				
				File scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrnsht, new File("C:\\Users\\91828\\OneDrive\\Desktop\\screenshot\\"+linkname + dt + ".png" ));
				
				links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			}
		}
		
	}

}
