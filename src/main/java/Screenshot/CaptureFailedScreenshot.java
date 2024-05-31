package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CaptureFailedScreenshot extends BaseClass implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("./screeenshot/dws"+ time+".png");
		try {
			FileHandler.copy(from, to);
		}catch (IOException e) {
			
			e.printStackTrace();		}
		
		
	}

}
