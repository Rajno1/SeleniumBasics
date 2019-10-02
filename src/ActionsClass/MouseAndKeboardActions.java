package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class MouseAndKeboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver(); // open browser
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies(); // Delete cookies
		driver.get("http://seleniumtrainingbangalore.com"); // enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // apply Implicitly wait
		driver.findElement(By.xpath("//button[@class='close']")).click(); 
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Branches']")); // inspect element and store value in variable
		
		Actions action = new Actions(driver); // create actions class
		action.moveToElement(btn).build().perform(); // mouse over on the element
		action.contextClick(btn).build().perform(); // right click on element
		action.sendKeys(Keys.ARROW_DOWN).build().perform(); // hit down arrow in keyboard
		action.sendKeys(Keys.ENTER).build().perform(); // hit enter on keyboard
		
		Thread.sleep(2000);
		driver.quit();
	}// not working 
	

}//Next we will se Drag and Drop concept

	