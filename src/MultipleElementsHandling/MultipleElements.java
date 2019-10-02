package MultipleElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();   //Open Browser
		driver.manage().window().maximize();     //Maximize Browser
		driver.get("http://www.krninformatix.com"); //Enter URL
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		//We use .findElements(); method to access multiple elements
		System.out.println(" Total number of links are "+links.size());  
		//print total number of links on the page(except img links)
		for (int i = 0; i < links.size(); i++) {
			String linksoutput = links.get(i).getText();
			System.out.println(linksoutput);
		}
	 Thread.sleep(2000);
	 driver.quit();
	}
	

}// Next We will learn aobut Browser actions
