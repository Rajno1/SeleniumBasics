package AttributeValue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Attributevalue {

	public static void main(String[] args) throws InterruptedException {
		//we use '.getAttribute()' method to get value of attribute.
		WebDriver driver = new SafariDriver();//Open Browser
		driver.manage().window().maximize(); //Maximize the Browser
		driver.manage().deleteAllCookies(); // Delete all Cookies
		driver.get("https://demo.actitime.com/login.do"); // Ener URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicitly wait
		
		driver.findElement(By.id("username")).sendKeys("admin"); //find element & enter username
		driver.findElement(By.name("pwd")).sendKeys("manager"); //find element & enter password
		driver.findElement(By.id("loginButton")).click(); //find login button & click on it
		
		Thread.sleep(10000);
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a")); //find elements with tagname
		System.out.println("Total number of links with TagName 'a' are "+totallinks.size());

		for (int i = 0; i< totallinks.size(); i++) {
			WebElement links = totallinks.get(i);
			String linktext = links.getAttribute("href"); //use .getAttribute method to get attribute value.
			System.out.println(linktext);
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(@id,'logoutLink')]")).click();
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Driver logged out");
		
		
	}

}//Next we will see Browser pop-ups

