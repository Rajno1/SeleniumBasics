package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ScreenshotSession {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.youtube.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType .FILE);
		FileUtils.copyFile(src, new File("./Screenshots/photo.png"));
		
		driver.quit();
	}
	

}
