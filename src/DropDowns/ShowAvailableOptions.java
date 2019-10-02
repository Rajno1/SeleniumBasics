package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;



public class ShowAvailableOptions {

	public static void main(String[] args) throws InterruptedException {
		//Here we are writing the code for Test case 3 
		// Testcase -3 : get all availabel options  ---- we use .getOptions()
		WebDriver driver = new SafariDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement SingleDropdown= driver.findElement(By.id("drop1"));  //First Find Element
		Select dd = new Select(SingleDropdown);							//Create 'select' class obj
		List<WebElement> allopptions = dd.getOptions();					//use '.getOptions()' method
		
		for (int i = 0; i < allopptions.size(); i++) {
			WebElement op = allopptions.get(i); 			//get index
			String text = op.getText();                     // get text
			System.out.println(text);               //print output
			
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
