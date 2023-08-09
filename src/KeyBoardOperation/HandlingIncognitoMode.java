package KeyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingIncognitoMode {

	public static void main(String[] args) throws InterruptedException {
		
//create object for Chrome Options		
		
		ChromeOptions options = new ChromeOptions();
		
//add argument		
		
		options.addArguments("--incognito");		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(1000);
		
		WebElement a = driver.findElement(By.xpath("//input[@id='username']"));
		a.sendKeys("sharad");
		
		WebElement b = driver.findElement(By.xpath("//input[@id='password']"));
		b.sendKeys("sharad");
		
		driver.close();
		
		
	}

}
