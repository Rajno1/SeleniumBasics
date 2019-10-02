package BrowserPoPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadPoPupTODesktop {

	public static void main(String[] args) {
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList",0);
		/*
		 *  by defauly value is 1 - to download download folder
		 *  0 - to download to desktop
		 *  2 - to download specific folder  
		 */
		FirefoxOptions option =new FirefoxOptions();
		option.setProfile(prof);
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/rajasekhar/Softwares/Selenium/GeckoDriver/geckodriver"); //Set system Properties
		WebDriver driver = new FirefoxDriver(option); // assign option to browser
		driver.manage().window().maximize(); // Maximize Browser window
		driver.manage().deleteAllCookies(); // Delete Cookies
		driver.get("https://www.seleniumhq.org/download/"); //Enter URL
		driver.findElement(By.id("close")).click(); // Click on yellow line pop-up
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2zm3ZzF']")).click(); // click on Download link
		
	}

}
