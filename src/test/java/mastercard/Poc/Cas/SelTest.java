package mastercard.Poc.Cas;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SelTest {
	
	
	@Test
	public void openUrl(){
		System.out.println("Class -APITest---------> api3 method");
		
		   WebDriver driver;
				
			
			System.setProperty("webdriver.chrome.driver", "C:\\Mayank_Projects\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);			
		
	}

}
