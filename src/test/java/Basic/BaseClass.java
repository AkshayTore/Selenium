package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

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
	@Parameters("url")
	public void beforeclass(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
	}
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforemethod(String username ,String password) {
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		
	}
	@AfterMethod
	public void aftermethod() {
		driver.findElement(By.xpath("//a[@class='ico-logut']")).click();
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}
	@AfterTest
	public void aftertest() {
		System.out.println("post condition for test runner");
	
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println(" The disconect from the database");
	}
	

}
