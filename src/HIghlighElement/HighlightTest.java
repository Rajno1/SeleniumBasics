package HIghlighElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class HighlightTest {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajasekhar_2@yahoo.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Maha@143");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		flash(loginButton, driver);
	//	drawBorder(loginButton, driver);	
	}

	public static void flash(WebElement element ,WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		
		for(int i=0;i<10;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+ color +"'", element);   // code to flash/highlight the element
		js.executeScript("arguments[0].style.border='3px solid red'", element);       //// code to draw border to the element
	
	try {
		Thread.sleep(200);
	}catch(InterruptedException e){
		
	}
	
	
}
/** now see the code to draw a broder
		
		public static void drawBorder(WebElement element, WebDriver driver) {

			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		*/
	
}//Next we will see how to do crossBrowser testing
