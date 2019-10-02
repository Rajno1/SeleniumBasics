package BrowserPoPUPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopUP {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * We have two types of  calender pop-ups
		 * 1. Which allows you to type date (you can see .sendkeys() methods to type date)
		 * 2. Which allows select date from calender pop up
		 */
		
		WebDriver driver = new SafariDriver(); // Open Browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // Delete Browser Coolies
		driver.get("https://www.redbus.in"); // Enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[contains(@class,'calendar icon')])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30); // These two lines are Explicitly wait
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[text()='25'])[2]"))).click();;
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
