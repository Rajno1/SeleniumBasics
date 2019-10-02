package ScrollDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.apple.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Use JavascriptExecutor to scroll down the page
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,750)");
		
		Thread.sleep(1000);
		
	}//Next we will see how to read excel file
	

}
