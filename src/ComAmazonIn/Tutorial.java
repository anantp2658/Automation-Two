package ComAmazonIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tutorial {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
//		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//Male RadioButton Test		
		WebElement radiobuttonMale= driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[1]"));
		radiobuttonMale.click();
		System.out.println(radiobuttonMale.getText());
		System.out.println(radiobuttonMale.isDisplayed());
		System.out.println(radiobuttonMale.isEnabled());
		System.out.println(radiobuttonMale.isSelected());
		
//FeMale RadioButton Test			
		WebElement radiobuttonFemale=driver.findElement(By.cssSelector("#mainContent > div:nth-child(7) > div > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=radio]:nth-child(2)"));
		radiobuttonFemale.click();
		System.out.println(radiobuttonFemale.getText());
		System.out.println(radiobuttonFemale.isDisplayed());
		System.out.println(radiobuttonFemale.isEnabled());
		System.out.println(radiobuttonFemale.isSelected());		
		
		driver.close();
	}

}
