package XpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Xpathsession1 {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.walgreens.com");
		
		driver.manage().window().maximize();
		
		/*Absolute Xpath: It's a complete full address of element from parent node to child node.In future if the locator place change, the Xpath 
		 * also will change so 'Absolute Xpath' is not advisable to use.------ so to avoid this issue we use "Dynamic Xpath".
		*/
		
		/*Dynamic Xpath: Syntax for Dynamic Xpath
		 *"//htmltag[@attribute = 'value']"
		*/
		driver.findElement(By.xpath("//input[@name = 'Ntt']")).sendKeys("Rapid-acting");
		driver.findElement(By.xpath("//button[@class='wag-header-search-btn']")).click();
		
		Actions action = new Actions(driver);    //Actios class user to make mouse moments
		
		action.moveToElement(driver.findElement(By.linkText("Rx Refills"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Auto Refill')]"))).click();
		
		
	}

}
