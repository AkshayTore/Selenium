package com.crm.ListenersCode;

import java.io.File;
import java.lang.ProcessHandle.Info;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Screenshot.BaseClass;

public class TakeScreenShotWithExtentReport extends BaseClass implements ITestListener {
	public ExtentReports report ;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "Welcome to our class...");
		test.log(Status.INFO, "my wonder fellow...");
	}
	@Override
	public void onTestSucess(ITestResult result) {
		test.log(Status.PASS, "Your test case has paassed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Your Test Case Has Failed");
		TakesScreenshot ts= (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Your Test Case has skipped");
	}
	@Override
	public void onStart(ITestContext context) {
		File path = new File("./capture.html");
		spark =new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("Mujhe pata nhi..context...");
		spark.config().setReportName("Akshay");
		spark.config().setTheme(Theme.STANDARD);
		report=new ExtentReports();
		report.setSystemInfo("Os", "Windows-10");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
		
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
