package dropdownsPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//button[@id='openwindow']"));
		first.click();
		Thread.sleep(2000);
		
		Set<String> pages = driver.getWindowHandles();
		Iterator<String> page2 =pages.iterator();
		
		String parent_window = page2.next();
		String child_window = page2.next();
		
		driver.switchTo().window(child_window);		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
				
		WebElement aboutus= driver.findElement(By.xpath("(//a[@href='about.html'])[1]"));
		aboutus.click();
		Thread.sleep(2000);
//		driver.close();
		
		driver.switchTo().window(parent_window);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);	
//		driver.quit();
	}

}
