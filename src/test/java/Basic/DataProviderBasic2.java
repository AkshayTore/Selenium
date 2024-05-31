package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic2 {
	@Test (dataProvider="login")
	public void reciever(String username , String password) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.shoppersstack.com/");
			driver.get("https://www.shoppersstack.com/user-signin");
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.cssSelector("(//span['MuiButton-label'])[9]")).click();
			Thread.sleep(15);
			driver.close();

	}

}
