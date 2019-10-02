package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement mutipleOption = driver.findElement(By.id("multiselect1")); //inspected the element
		Select dd = new Select(mutipleOption); // Create Select class
		// we inspected the element and Created the Select class object 
		// now select the options
		dd.selectByIndex(0);
		Thread.sleep(1000);
		dd.selectByValue("audix");
		Thread.sleep(1000);
		dd.selectByVisibleText("Hyundai");
		
		Thread.sleep(2000);
		//Deselect 
		dd.deselectAll(); // it will deselect the all selected options.
		
	}

}
