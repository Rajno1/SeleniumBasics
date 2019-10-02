package NewTabHandling;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NewTab {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open();"); // it will open a new Tab
		Thread.sleep(2000);
		ArrayList<String> set = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(set.get(0)); // it will switch the controle on new tab
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		driver.switchTo().window(set.get(1)); // switch the controle on old tab
		driver.findElement(By.name("q")).sendKeys("Rajasekhar");
		
	}

}// next we will see how to highlight and draw a border on element

