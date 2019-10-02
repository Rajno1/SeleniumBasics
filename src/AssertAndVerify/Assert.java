package AssertAndVerify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert {
	
WebDriver driver;

@BeforeMethod
public void openBrowser() {
	driver = new SafariDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test
  public void AdminLogin() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
  }
@Test
public void Validate() throws InterruptedException {
	Thread.sleep(10000);
	String title = driver.getTitle();
	String Expected = "actiTIME - Enter"; // Expected title is "actiTIME - Enter Time-Track" but we made intesionally worg here
	org.testng.Assert.assertEquals(title, Expected,"Title Not Matched");
	System.out.println("Assert starts here.....");
	System.out.println("Assert control jumped to next line...");
	driver.findElement(By.id("logoutLink")).click();
	 
}

@AfterMethod
public void closeBrowser() throws InterruptedException {
	Thread.sleep(1000);
	driver.quit();
}
}
