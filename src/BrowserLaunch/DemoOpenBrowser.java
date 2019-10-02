package BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class DemoOpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver(); //WebDriver- interface ; driver-> reference variable ; new SafariDriver -> an object
		//.get() method is used to launch the URL
		driver.get("https://demo.actitime.com/login.do"); 
		driver.manage().window().maximize(); //Used to maximize the window
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(1000);
		driver.quit();
	
			
	}

}
