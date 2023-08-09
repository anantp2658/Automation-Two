package ComAmazonIn;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfYouTube3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			
	WebDriver driver =new ChromeDriver();
	driver.get("https://Youtube.com");
	//TakesScreenshot webdriver = (TakesScreenshot) driver;
	//TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(SrcFile, new File("E:\\Java Program Practice\\Test Evidences\\Youtube\\screenshot.png"));
	
	Thread.sleep(2000);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	//File SrcFile1=scrShot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(SrcFile1, new File("E:\\Java Program Practice\\Test Evidences\\Youtube\\screenshot1.png"));
	
	//driver.manage().window().maximize();
	
	WebElement a = driver.findElement(By.tagName("input"));
	a.click();
	
	//File SrcFile2=scrShot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(SrcFile2, new File("E:\\Java Program Practice\\Test Evidences\\Youtube\\screenshot2.png"));
	
	a.sendKeys("Ram Siya Ram");
	
	//File SrcFile3=scrShot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(SrcFile3, new File("E:\\Java Program Practice\\Test Evidences\\Youtube\\screenshot3.png"));
	
	WebElement a1 =driver.findElement(By.id("search-icon-legacy"));
	
	//WebElement a1 =driver.findElement(By.cssSelector("button#search-icon-legacy"));
	
	a1.click();
	Thread.sleep(2000);
	
	//File SrcFile4=scrShot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(SrcFile4, new File("E:\\Java Program Practice\\Test Evidences\\Youtube\\screenshot4.png"));
	
	WebElement a2 =driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a"));
	a2.click();
	
	
	Thread.sleep(30000);
	
	//File SrcFile5=scrShot.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(SrcFile5, new File("E:\\Java Program Practice\\Test Evidences\\Youtube\\screenshot5.png"));
	
	
	
	//driver.close();

	}

}
