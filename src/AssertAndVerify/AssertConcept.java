package AssertAndVerify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class AssertConcept {

	public static void main(String[] args) throws InterruptedException {
		//If Assert condition becomes 'False',next line of test execution will get stop
		//To over come this we use 'Soft Assert' by using 'Try-Catch'  let's see now
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(10000);
		String title = driver.getTitle();
		String Expected = "actiTIME - Enter"; // Expected title is "actiTIME - Enter Time-Track" but we made intesionally worg here
		
		System.out.println("Assert starts here.....");
		Assert.assertEquals(title, Expected,"Title Not Matched"); 
		
		// "Control will get stop HERE,Because Assert is 'False' "
		//To over come this we use 'Soft Assert' let's see 'What is SoftAssert' Next
		
		System.out.println("Assert control jumped to next line...");
		driver.findElement(By.id("logoutLink")).click();
		
		Thread.sleep(1000);
		driver.quit();
	}
//Next we will see SoftAssert using Try-catch
}
