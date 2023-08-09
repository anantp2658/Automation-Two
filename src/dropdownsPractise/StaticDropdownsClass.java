package dropdownsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement currency =driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		currency.click();
		Thread.sleep(3000);
		
//Create Class		
		Select a=new Select(currency);
		a.selectByIndex(1);           
		Thread.sleep(3000);
		
		a.selectByIndex(2);           
		Thread.sleep(3000);
		
		a.selectByValue("USD");
		Thread.sleep(3000);
		
		a.selectByVisibleText("Select");
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
