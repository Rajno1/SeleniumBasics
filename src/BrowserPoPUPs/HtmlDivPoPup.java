package BrowserPoPUPs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class HtmlDivPoPup {

	public static void main(String[] args) throws InterruptedException {
		
		//Tool-tip pop-up generating using html dive
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/apple-iphone-7-silver-32-gb/p/itmen6dawz2g5dry?pid=MOBEMK62HSQDSGGF&srno=s_1_3&otracker=search&otracker1=search&lid=LSTMOBEMK62HSQDSGGF0VRDJD&fm=SEARCH&iid=e4d9a415-56e7-4d9f-9ceb-993d9afa5cd0.MOBEMK62HSQDSGGF.SEARCH&ppt=sp&ppn=sp&ssid=n73t40eenfzlou801566568547751&qH=356b1940756f13bc");
		driver.findElement(By.xpath("(//span[contains(@class,'question')])[1]")).click();
		WebElement div = driver.findElement(By.xpath("//div[contains(@class,'_2iz2Ct U_Sam7 _1WTi3x')]"));
		String output = div.getText();
		System.out.println(output);
		Thread.sleep(2000);
		driver.quit();
	}

}
