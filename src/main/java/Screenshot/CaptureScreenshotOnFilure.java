package Screenshot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Assignment.BaseClass;
 

public class CaptureScreenshotOnFilure extends BaseClass{
	@Test
	public void dwsloginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElements(By.xpath("//a[text()='Log in']"));
	}

}
