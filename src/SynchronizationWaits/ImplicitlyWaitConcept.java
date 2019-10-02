package SynchronizationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * Thread.sleep()- it will make the webdriver to wait until to completed the specied time
		 * but ImplicitlyWait - will move the control to the next once the page got loaded 
		 */
	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
	}

}
