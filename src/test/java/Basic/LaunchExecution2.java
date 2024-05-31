package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchExecution2 {
	@Test
public void fastrack() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.fastrack.in/shop/fastrack-sale?utm_source=google&utm_medium=cpc&utm_campaign=MS_FasTrack_Google_Brand-search_AnalogPerformingkwds_Exact_Perf_20042023&utm_content=19146789532&gad_source=1&gclid=Cj0KCQjw6PGxBhCVARIsAIumnWa8JPIUwau7nYUvzOIrIHSdivH5cE9E34tM6BZR4ZAEBUyKwuCrC7MaAoFsEALw_wcB");
	driver.close();
	
}   
	@Test
	public void boat() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.boat-lifestyle.com/collections/smart-watches?gad_source=1&gclid=Cj0KCQjw6PGxBhCVARIsAIumnWYKsLAhTQBbOlCmYYVSQG7c8cln2EwyzaII9xFbxHqcRksSggy-K3caAtB5EALw_wcB");
		driver.close();
		
	}
	@Test
	public void noise() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.gonoise.com/collections/smart-watches");
		driver.close();
	}
	@Test
	public void titan() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.titan.co.in/shop/watches-for-men?lang=en_IN");
		driver.close();
		
	}
	@Test
	public void rolex() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.rolex.com/watches/new-watches?gclid=Cj0KCQjw6PGxBhCVARIsAIumnWaUoh5UTX1REknQZgqv_jsajvivTAPHgXmTjCnl7BbbvIS_N0JzDvkaAo2qEALw_wcB&ef_id=Cj0KCQjw6PGxBhCVARIsAIumnWaUoh5UTX1REknQZgqv_jsajvivTAPHgXmTjCnl7BbbvIS_N0JzDvkaAo2qEALw_wcB:G:s&s_kwcid=AL!141!3!695960092440!e!!g!!rolex%20men!8671766804!85335560285&gad_source=1");
		driver.close();
	}
}
