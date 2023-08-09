package ComAmazonIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComSalseForce {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
//		driver.manage().window().maximize();
		Thread.sleep(3000);
				
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abcd");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("abcd@1234");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("abcd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@name='login']/input[2]")).sendKeys("1234");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='cancel']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Use Custom Domain")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='hint_back_domain']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
