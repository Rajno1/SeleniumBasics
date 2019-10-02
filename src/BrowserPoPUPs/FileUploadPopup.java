package BrowserPoPUPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * We can use ‘.driver.findElement()’ to find the element 
		 * and use ‘.senkeys()’ and paste the full path of the file as an argument to the senkeys.
		 */
		
		WebDriver driver = new SafariDriver(); // Open Browser
		driver.manage().window().maximize(); // Maximize the Window
		driver.manage().deleteAllCookies(); // delete cookies
		driver.get("https://compressjpeg.com"); // Enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Apply implicitly wait
		
		driver.findElement(By.xpath("//span[text()='Upload Files']")).sendKeys("/Users/rajasekhar/Photos/Rajasekhar.JPG");
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
