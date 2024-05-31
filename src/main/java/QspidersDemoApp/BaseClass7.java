package QspidersDemoApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass7 {
	WebDriver driver = new ChromeDriver();
	
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
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
    }
    @Parameters({"username","Email","password"})
    @BeforeMethod
       public void beforemethod(String username,String email,String password, Object driver) {
    	WebDriver driver1= new ChromeDriver();
    	driver1.findElement(By.id("name")).sendKeys(username);
    	driver1.findElement(By.id("email")).sendKeys(email);
    	driver1.findElement(By.id("password")).sendKeys(password);
    	driver1.findElement(By.xpath("//button[text()='Register']")).click();
    }
    @AfterMethod
    public void aftermethod() {
    	By driver1 = null;
		driver1.findElement((SearchContext) By.id("email")).sendKeys("akshaytore24@gmail.com");
    	driver1.findElement((SearchContext) By.id("password")).sendKeys("Akshay@123");
    	driver1.findElement((SearchContext) By.cssSelector("button[type='submit']")).click();
    	
    	
    }
		
	}


