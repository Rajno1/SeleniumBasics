package BrowserPoPUPs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class DiffPoPups {

	public static void main(String[] args) throws InterruptedException {
		
		/* 
		 * in our day to day life we can see 6 to 7 types of pop-ups
		 *  1.Tool Tip pop-up
		 *  2.Calender pop-up
		 *  3.JavaScript alert,Conformation and prompt popup
		 *  4.page on-load authuntication pop-up
		 *  5.File upload pop-up
		 *  6.File Downlad pop-up
		 *  7.New Tab/New Window/New Browser/lgiht-box model window
		 */
	/*
	 * Here we will see 'Tool Tip Pop-up'
	 * Tool tips are 2 types
	 * 1.Generating using title attribute
	 * 2.Has a pop in html(div pop-up) 
	 * 
	 */

		//Tool-tip pop-up generating using title attribute
		
		WebDriver driver = new SafariDriver(); //open Browser
		driver.manage().window().maximize(); //Maximize the Browser
		driver.manage().deleteAllCookies(); //Delete all cookies
		driver.get("https://www.gsmarena.com/res.php3?sSearch=iPhone+"); //open URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicitly wait
		WebElement element = driver.findElement(By.xpath("//img[contains(@src,'apple-iphone-xs-max-new1.jpg')]")); //find the element
		String title = element.getAttribute("title");// use getAttribute method and store it in a string variable
		//Every pop-up message will be stored in 'title' attribute
		System.out.println(title);// print title mesage
		Thread.sleep(1000);//Wait for 10 sec
		driver.quit();//close the driver
		
		
	}

}
