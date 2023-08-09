package dropdownsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement passengers = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passengers.click();
		
		Thread.sleep(3000);
		
		for(int i=0; i<=3;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		Thread.sleep(3000);
		
	WebElement auto =driver.findElement(By.xpath("//input[@id='autosuggest']"));
	auto.sendKeys("ind");
	Thread.sleep(3000);
	
	WebElement india=driver.findElement(By.xpath("//a[@id='ui-id-82']"));
	india.click();
	Thread.sleep(3000);
	
	}
}
