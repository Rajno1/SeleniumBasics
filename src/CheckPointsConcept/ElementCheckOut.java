package CheckPointsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ElementCheckOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		boolean checkbox= driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(checkbox);
		
		Thread.sleep(10000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean checkbox1= driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(checkbox1);
		
		Thread.sleep(10000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean checkbox2= driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(checkbox2);
		
	}

}
