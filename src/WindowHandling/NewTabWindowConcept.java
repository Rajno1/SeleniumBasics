package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTabWindowConcept {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new SafariDriver(); //Open Browser
		driver.manage().window().maximize(); // Maximize Broser
		driver.manage().deleteAllCookies(); // Delet Cookies
		driver.get("https://www.irctc.co.in/nget/train-search"); // Open URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Apply Implicity Wait
		driver.findElement(By.xpath("(//a[@href='https://www.air.irctc.co.in'])[1]")).click();
		//Inspect element and click, it will open new window
		
		Set<String> allwindows = driver.getWindowHandles(); //use .getWindowHandles
		Iterator<String> it = allwindows.iterator(); // use Iterator to get all windows
		String irctc = it.next();  // get window id of source page
		String Flights = it.next(); // get window id of destination page
		//System.out.println(irctc); // print window id of source page
		//System.out.println(Flights); // print window id of destination page
		
		driver.switchTo().window(Flights); //Switch to new window
		Thread.sleep(1000); // Wait for 1 sec
		driver.findElement(By.id("stationFrom")).sendKeys("Bangaluru"); 
		driver.findElement(By.id("stationTo")).sendKeys("Chennai");
		
		driver.close();
		driver.switchTo().window(irctc); // Switch to old window
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@class,'ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete')])[1]")).sendKeys("Bengaluru");
		
		Thread.sleep(1000);
		driver.quit();
	}
//Next we will see about iframes
}
