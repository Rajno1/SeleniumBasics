package BrowserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		//we can not inspect forward,backword & referesh operations from Browser
		//lets see how to operate these actions
		WebDriver driver = new SafariDriver(); //Open Browser
		driver.manage().window().maximize(); //Maximize the Browser
		driver.get("https://www.javatpoint.com"); 
		//we can use 'driver.naviage().to("URL") insted .get
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //set Pageload time
		
		driver.findElement(By.linkText("Selenium")).click();  //it will click on selenium tab
		Thread.sleep(2000);
		
		driver.navigate().back(); //backword action
		System.out.println("backword action completed");
		Thread.sleep(2000);
		
		driver.navigate().forward(); //forward action
		System.out.println("forward action completed");
		Thread.sleep(2000);
		
		driver.navigate().refresh(); // to refresh the page
		System.out.println("Refresh action completed");
		
	}

}//Next we will see the concept of syncronization

