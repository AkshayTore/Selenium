package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ShopperStack {
	@Parameters({"url","username","password"})
	@Test
	public void shopperstack(CharSequence username, CharSequence password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    String url = "https://www.shoppersstack.com/";
		driver.get(url);
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loginBtn")));
		WebElement Login_button = driver.findElement(By.id("loginBtn"));
		Object JavascriptExecutor;
		if(Login_button.isEnabled()) {
			Login_button.click();

			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
		}
		else {
			
  			JavascriptExecutor js=(JavascriptExecutor) driver;
  		    js.executeAsyncScript("arguments[0].click()", Login_button);
		}
		
	}

}
