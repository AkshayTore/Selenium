package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("connection to the database");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("precondition for test runner");
	}
	@BeforeClass
	public void beforeclass() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
	}
	@BeforeMethod
	public void beforemethod() {
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("Akshay@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
	}
	//@AfterMethod
	//public void aftermethod() {
		
		                            
		
		
	//}
	@AfterClass
	public void afterclass() {
		driver.close();
	}

}
