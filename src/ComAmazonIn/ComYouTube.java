package ComAmazonIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComYouTube {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://Youtube.com");
	
	Thread.sleep(2000);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.manage().window().maximize();
	
	WebElement a = driver.findElement(By.tagName("input"));
	a.click();
	
	a.sendKeys("Ram Siya Ram");
	
	//WebElement a1 =driver.findElement(By.id("search-icon-legacy"));
	
	WebElement a1 =driver.findElement(By.cssSelector("button#search-icon-legacy"));
	
	a1.click();
	Thread.sleep(2000);
	
	WebElement a2 =driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a"));
	a2.click();
	
	
	Thread.sleep(30000);
	
	driver.close();

	}

}
