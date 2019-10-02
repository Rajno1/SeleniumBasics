package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// in Dropdowns we have single option selector & multioption seclector Dropdown
		/*
		 * Let's see the Testcase we write for Droptdown
		 * 1. Select single/mutilple options from the Dropdown
		 * 2. deselect the selected option form Mutiple dropdown 
		 * 3. get all available options from the list
		 * 4. get only selected options from multi options list
		 */
	//Test Case-1: Select single option
		
		WebDriver driver = new SafariDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement SingleDropdown= driver.findElement(By.id("drop1"));  //Find Element
		Select dd = new Select(SingleDropdown);
		dd.selectByIndex(2);
		Thread.sleep(1000);
		dd.selectByValue("mno");
		Thread.sleep(1000);
		dd.selectByVisibleText("doc 1");
		
		
	}

}
