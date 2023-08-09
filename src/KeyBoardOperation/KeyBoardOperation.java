package KeyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(1000);

//		driver.manage().window().maximize();
		
		WebElement usr=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(1000);
		
		usr.sendKeys("sharad");
		Thread.sleep(1000);
		
		usr.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		
		usr.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(1000);
		
		last.sendKeys(Keys. CONTROL + "v");
		Thread.sleep(1000);
		
		last.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(1000);
		
		last.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		last.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(1000);
		
		last.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		driver.close();
	}

}
