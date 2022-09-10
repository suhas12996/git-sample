package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	
	@BeforeSuite
	public void Setup_browser() {
		System.out.println("Setuping the browser");
	}
	
	@BeforeTest
	public void Launch_browser() {
		System.out.println("Launch the browser");
	}

	@BeforeClass
	public void Login() {
		System.out.println("Logging into the browser");
	}
	
	@BeforeMethod
	public void Valid_Credentialsr() {
		System.out.println("Setuping the browser");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test Case 1");
	}
	@Test
	public void Test2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test Case 3");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logging out from portal");
	}
	
	@AfterClass
	public void Close_browser() {
		System.out.println("Close the browser");
	}
	
	@AfterTest
	public void Clear_Cookies() {
		System.out.println("Clear The cookies");
	}
	
	@AfterSuite
	public void Report() {
		System.out.println("Report Generation");
	}
}
