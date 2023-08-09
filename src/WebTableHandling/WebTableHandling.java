package WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	
	List <WebElement> ab= d.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	Thread.sleep(1000);
	
	System.out.println(ab.size());
	Thread.sleep(1000);
	
//1st Approach	
	for(WebElement k:ab)
	{
		System.out.println(k.getText());
	}
//2nd Approach
	
	
	}

}
