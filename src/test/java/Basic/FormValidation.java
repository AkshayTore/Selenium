package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormValidation {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    
    driver.findElement(By.id("name")).sendKeys("Akshay");
    driver.findElement(By.id("email")).sendKeys("akshaytore24@gmail.com");
    driver.findElement(By.id("password")).sendKeys("123456");
    
	}



}
