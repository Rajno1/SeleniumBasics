package CrossBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsing {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browserTesting(String browserName) throws Exception {
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/rajasekhar/Softwares/Selenium/ChromeDriver/chromedriver");
			
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "/Users/rajasekhar/Softwares/Selenium/GeckoDriver/geckodriver");
			
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Safari")) {
			
			driver = new SafariDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("how to install internet explorer in MacBookAir");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
