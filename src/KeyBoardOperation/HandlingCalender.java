package KeyBoardOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(1000);
	
	WebElement a = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	a.click();
		
	  List<WebElement> b=driver.findElements(By.xpath("//td[@data-month='7']"));
	  Thread.sleep(1000);
	  
	  for(WebElement e:b) 
	  { if (e.getText().equalsIgnoreCase("20")) 
	  { 
		  e.click();
		  break; 
		  } 
	  }
/*	  
		WebElement c=driver.findElement(By.xpath("//a[@title='Next']"));
		c.click();	
		
		 List<WebElement> c1=driver.findElements(By.xpath("//td[@data-month='8']"));
		 Thread.sleep(1000);
		
		 for(WebElement d:c1)
		 {
			 if(d.getText().equalsIgnoreCase("12"))
			 {
				 d.click();
				 break;
			 }
		 }
*/		 
	}
}
