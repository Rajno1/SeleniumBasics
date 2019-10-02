package BrowserPoPUPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AlertboxPoPup {

	public static void main(String[] args) throws InterruptedException {
		
		// Alert pop-up has only 'OK' button to accept
		
		WebDriver driver = new SafariDriver(); //Open Browser
		driver.manage().window().maximize(); //Maximize the window
		driver.manage().deleteAllCookies(); //Delete Cookies
		driver.get("https://www.testandquiz.com/selenium/testing.html"); //Enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicity Wait
		
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click(); //Inspect element
		Alert alert = driver.switchTo().alert(); //Switch to alert
		Thread.sleep(2000); //Wait for 2 sec
		System.out.println("*** Alert Message is --> " +alert.getText()); // get pop up message
		alert.accept(); // accept alert
		Thread.sleep(2000); //Wait for 2 sec
		driver.quit(); // close the Browser
		
		
	}

}// Next we will see confirmation pop-up


