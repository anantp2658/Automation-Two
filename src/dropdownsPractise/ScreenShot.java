package dropdownsPractise;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
//**Full Screenshot**		
		File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:\\Java Program Practice\\Test Evidences\\TC_One.png"));
		Thread.sleep(1000);
		
//Partial Screenshot
		
		WebElement a=driver.findElement(By.xpath("//div[@id='mainContent']"));		
		
		File screenshot2 = a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File("E:\\Java Program Practice\\Test Evidences\\TC_Two.png"));
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
