package dropdownsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsListOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement a = driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		a.click();
		Thread.sleep(3000);
		
		WebElement pune = driver.findElement(By.xpath("//a[@text='Pune (PNQ)']"));
		pune.click();
		System.out.println(pune.getText());
		Thread.sleep(3000);
		
		WebElement goa = driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]"));
		goa.click();
		System.out.println(goa.getText());
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
