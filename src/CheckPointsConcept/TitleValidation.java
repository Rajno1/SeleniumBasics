package CheckPointsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TitleValidation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();                  //Opend Browser
		driver.manage().window().maximize();                    //Maximize the window
		driver.get("https://demo.actitime.com/login.do");       //Enter URL
		driver.findElement(By.id("username")).sendKeys("admin");//Enter Username
		driver.findElement(By.name("pwd")).sendKeys("manager"); //Enter Password
		driver.findElement(By.id("loginButton")).click();   	//Click on Login button
		Thread.sleep(10000);                                    //Wait to page load
		String ActualResult =driver.getTitle();                 //get page title and store in one variable 
		String ExpectedResult = "actiTIME - Enter Time-Track";  //compate with expected result
		
		if (ActualResult.equals(ExpectedResult)) {				//write a logic to print 'pass' if both match, else 'fail'
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");
		}
	}

}
/* Every single point under the expected column in manual testcase sould be 
 * preset as a check point in the automation testscript, selenium recommands 4 types of check points
 * 1.Title Checkpoint
 * 2.Text Checkpoint
 * 3.URL Checkpoint
 * 4.Element Checkpoint
*/

//Next we will see 'Text Checkpoint'