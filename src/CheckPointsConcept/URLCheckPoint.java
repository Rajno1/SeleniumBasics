package CheckPointsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class URLCheckPoint {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		String ActualURL=driver.getCurrentUrl();
		String ExpectedURL="https://demo.actitime.com/user/submit_tt.do";
		if (ActualURL.equals(ExpectedURL)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}

}
