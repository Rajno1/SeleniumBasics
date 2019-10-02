package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver(); // Open Browser
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete cookies
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html"); // Enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Apply Implicityl wait
		
		WebElement source = driver.findElement(By.xpath("(//h1[@class='draghandle'])[1]")); //inspect source element
		WebElement destination = driver.findElement(By.id("column-2")); // inspect destination element
		Actions action = new Actions(driver); // create Actions class
		action.dragAndDrop(source, destination).perform(); // use draganddrop method to perform action 		
		
		Thread.sleep(2000);
		driver.quit();
	
	}
}
//Next we will see New Tab/New Window concept(Window Handling)

