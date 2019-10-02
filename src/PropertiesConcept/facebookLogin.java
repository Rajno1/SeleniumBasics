package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class facebookLogin {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		//Login to facebook by using data in properties file
		
		Properties prop = new Properties();         // created imported properties object from java.util package
		FileInputStream input = new FileInputStream("/Users/rajasekhar/eclipse-workspace/SeleniumConcetps/src/PropertiesConcept/Logindetails.properties");  // created imported FileInputStream object from java.io package
	
		prop.load(input);
		
		String url = prop.getProperty("URL");
		String loginid = prop.getProperty("username");
		String credentials = prop.getProperty("password");
		
		String browser = prop.getProperty("Browser");
		
		if(browser.equals("Safari")) {
			
			driver = new SafariDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}else{
			System.out.println("Enter a valid Browser name");
		}
		
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys(loginid);
		
		Thread.sleep(200);
		
		driver.findElement(By.name("pass")).sendKeys(credentials);
		
		Thread.sleep(200);
		
		driver.findElement(By.id("u_0_2")).click();
		
		
		}
		
}
