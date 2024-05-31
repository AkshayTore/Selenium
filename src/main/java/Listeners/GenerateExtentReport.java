package Listeners;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateExtentReport implements ITestlistener {
	public ExtentReports report;
	public ExtentSparkReporter spark ;
	public ExtentTest test;
    @Override
	public void onTestStart(ITestResult result) {
		String name =result.getMethod().getMethodName();
		test=report.createTest(name);
		System.out.println("OnTestStart");
	}
	@Override
	public void onTestSucess(ITestResult result) {
		System.out.println("onTestSucess");
		String name =result.getMethod().getMethodName();
		System.out.println("onTestFailure");
		test.log(Status.PASS,name+" is passed");
     }
	@Override
	public void onTestFailure(ITestResult result) {
		String name= result.getMethod().getMethodName();
		System.out.println("on test failure");
		test.log(Status.FAIL,name+" is failed" );
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String name= result.getMethod().getMethodName();
		System.out.println("onTestSkipped");
		test.log(Status.SKIP,name+" is skipped" );
	}

}

