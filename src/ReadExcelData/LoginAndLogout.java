package ReadExcelData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class LoginAndLogout {

	public static void main(String[] args) throws InterruptedException {
		
		ExcelData data = new ExcelData();
		WebDriver driver = new SafariDriver(); //WebDriver- interface ; driver-> reference variable ; new SafariDriver -> an object
		driver.manage().window().maximize(); //Used to maximize the window
		driver.manage().deleteAllCookies(); // Delet all cookies
		driver.get("https://demo.actitime.com/login.do"); // Ener URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Apply Implicity wait
		
		int NumOfRows = data.getLastRownum();
	
		for (int i = 1; i < NumOfRows; i++) {
			String un = data.getExcelData("Sheet1", i, 0);
			String pw = data.getExcelData("Sheet1", i, 1);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("logoutLink")).click();
		
		}
			
	}
//Next we will see how to write excel 
}
