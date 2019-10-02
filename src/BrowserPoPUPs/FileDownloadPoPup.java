package BrowserPoPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FileDownloadPoPup {

	public static void main(String[] args) {
		//File Download PoP UP is also know as 'save to disk pop-up'
		/*
		 * Before going to launch Browser , we need to create a profile and add few seeting to that profile 
		 * Then assign this profile to Browser.
		 */
		
		//To save the file to the downloads folder
		
		FirefoxProfile prof = new FirefoxProfile(); // Create Profile 
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip"); //set preference to profile
		FirefoxOptions option = new FirefoxOptions(); // create options
		option.setProfile(prof); // assign profile to options
				
		System.setProperty("webdriver.gecko.driver", "/Users/rajasekhar/Softwares/Selenium/GeckoDriver/geckodriver"); //Set system Properties
		WebDriver driver = new FirefoxDriver(option); // assign option to browser
		driver.manage().window().maximize(); // Maximize Browser window
		driver.manage().deleteAllCookies(); // Delete Cookies
		driver.get("https://www.seleniumhq.org/download/"); //Enter URL
		driver.findElement(By.id("close")).click(); // Click on yellow line pop-up
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2zm3ZzF']")).click(); // click on Download link
		
	} // The result zip file will download to download folder.

}//Next we will see how to download file to the destop
