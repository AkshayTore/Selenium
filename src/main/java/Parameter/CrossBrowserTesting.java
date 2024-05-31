package Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class CrossBrowserTesting {
	public WebDriver driver;
	@Parameters ("url")
	@Test
	
	
	public void CrossBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
	
		else if(browser.equalsIgnoreCase("edge")) {
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://manis.in/");
	}

}
