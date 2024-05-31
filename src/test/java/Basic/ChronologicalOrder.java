package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@Test
	public void testCase() {
		System.out.println("Test Case2");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}

	@Test
	public void testcase() {
		System.out.println("TestCase");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	
}
