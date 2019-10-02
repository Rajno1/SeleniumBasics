package BrowserPoPUPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ConfirmationPoPup {

	public static void main(String[] args) throws InterruptedException {
		//Confirmation pop-up has both 'OK' and 'Cancel' button to accept and dismiss
		
		WebDriver driver = new SafariDriver();// Open Browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // Delete all cookies
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicitly Wait 
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click(); //find the element & click
		Alert alertOK = driver.switchTo().alert(); // swith to alert
		System.out.println("Alert message is -> " + alertOK.getText()); //get message on pop-up box
		Thread.sleep(2000); // wait for 3 sec
		alertOK.accept(); // click on 'OK' button
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click(); //find the element & click
		Alert alertCAN = driver.switchTo().alert(); // swith to alert 
		Thread.sleep(2000);
		alertCAN.dismiss(); // click on 'Cancel' button
		driver.quit();
		
		
	}

}// Next we will see 'File upload pop-up'

