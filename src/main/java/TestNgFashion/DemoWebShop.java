package TestNgFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DemoWebShop {
	@Parameter ("url")
	@Test (groups = "smoke")
	public void dws() throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.close();
	
		
		
	}

}
