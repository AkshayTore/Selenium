package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class AsserSoft {
	@Test
	public void assertmethod() {
		String expected_result = "https://demowebshop.tricentis.com/";
		String a= "Akshay";
		String b= null;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ass=new SoftAssert();
		String actual_result=driver.getCurrentUrl();
		boolean result = expected_result.equals(actual_result);
		ass.assertTrue(result);
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		ass.assertAll();
			}

}
