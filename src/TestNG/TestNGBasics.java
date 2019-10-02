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

public class TestNGBasics {

	@BeforeSuite
	public void setup() {
		
		System.out.println("BeforeSuit Annotaion..... set system properties");
	}
	
	@BeforeTest
	public void launchBrowser() {
		
		System.out.println("BeforTest Annotation ... launch browser");
	}
	
	@BeforeClass
	public void enterURL() {
		
		System.out.println("BeforeClass Annotation.... lauch URl");
	}
	
	@BeforeMethod
	public void login() {
		
		System.out.println("BeforeMethod Annotation...Loign to App");
	}

	@Test
	public void getTitle() {
		
		System.out.println("Test Annotation.... get page title");
	}
	
	@Test
	public void gettitle1() {
	
		System.out.println("2Test Annotation.... get page title1");
	}
	
	@Test
	public void gettitle2() {
	
		System.out.println("3Test Annotation.... get page title2");
	}


	@AfterMethod
	public void dataenter() {
		
		System.out.println("AfterMethod Annotation...enter details");
        System.out.println("******************");
	}
	
	@AfterClass
	public void printtitle() {
		
		System.out.println("AfterClass Annotaion... print page title");
	}
	
	@AfterTest
	public void closebrowser() {
		
		System.out.println("AfterTest Annotaion...close browser");
	}
	
	@AfterSuite
	public void result() {
		
		System.out.println("AfterSuit Annotation.... print the report");
	}
 


}
