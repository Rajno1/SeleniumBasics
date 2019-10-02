package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class ShowOnlySelecteOptions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		WebElement mutipleOption = driver.findElement(By.id("multiselect1")); //inspected the element
		Select dd = new Select(mutipleOption); // Create Select class
		dd.selectByIndex(0);
		Thread.sleep(1000);
		dd.selectByValue("audix");
		Thread.sleep(1000);
		dd.selectByVisibleText("Hyundai");
		List<WebElement> slectedop = dd.getAllSelectedOptions();
		
		
		for (int i = 0; i <slectedop.size()  ; i++) {
			WebElement selone= slectedop.get(i);
			String text = selone.getText();
			System.out.println(text);
		}
			
	}

}
