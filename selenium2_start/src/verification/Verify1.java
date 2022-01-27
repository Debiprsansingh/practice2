package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.browserlaunching.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		String actuallink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		System.out.println(actuallink);
		String expectedlink="Customer Serv";
		System.out.println(expectedlink);
		//if(actuallink.equalsIgnoreCase(expectedlink))
		//if(actuallink.equals(expectedlink))
		System.out.println(actuallink);
		if (actuallink.contains(expectedlink))
		{
			System.out.println("both links are equal");
		}
		else
			System.out.println("both links are not equal");
		
	}

}
