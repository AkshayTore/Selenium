package TestNgFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KalkiShop {
	@Test (groups = "smoke")
	public void kalki() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
