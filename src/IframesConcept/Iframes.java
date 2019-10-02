package IframesConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();// open browser
		driver.manage().window().maximize();// maximize browser  
		driver.get("file:///Users/rajasekhar/Softwares/Selenium/frames/frames.html");// enter URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Apply implicity wait
		
		driver.switchTo().frame("secondframe"); // sitch to frame string 
		driver.findElement(By.name("name1")).sendKeys("Rajasekhar"); 
		driver.findElement(By.name("rep")).click(); 
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		WebElement frm = driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.name("check")).click();
		
		Thread.sleep(1000);
		driver.quit();
		
		
	}//Next we will see how to scroll the page

}
