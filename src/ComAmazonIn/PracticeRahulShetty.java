package ComAmazonIn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeRahulShetty {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
	
	WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']")); 
	a.click();
	Thread.sleep(3000);
	WebElement a1 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
	a1.click();
	Thread.sleep(3000);
	WebElement a2 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
	a2.click();
	Thread.sleep(3000);
	
	System.out.println(a.isDisplayed());
	System.out.println(a1.isEnabled());
	System.out.println(a2.isSelected());
	
	List<WebElement> d = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(int i=0; i<d.size();i++)
	{
		d.get(i).click();
	}	
	Thread.sleep(3000);
	
	for (WebElement c:d)
	{
		c.click();
	}	
	}
}
