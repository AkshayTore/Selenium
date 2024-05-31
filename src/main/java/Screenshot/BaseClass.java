package Screenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Welcome To The Page");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("Thanxx For Coming!");
	}
	@AfterClass
	public void afterclass() {
		driver.quit();
	}
	public void onTestFailure() {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSucess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
