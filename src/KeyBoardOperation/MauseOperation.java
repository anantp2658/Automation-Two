package KeyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MauseOperation {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    Thread.sleep(1000);
    
    WebElement a = driver.findElement(By.xpath("//button[@id='openwindow']"));
    Thread.sleep(1000);
    
    Actions action = new Actions(driver);
    action.contextClick(a).build().perform();
    Thread.sleep(1000);
    
    action.doubleClick(a).build().perform();
    Thread.sleep(1000);
        
    driver.close();
    
    
	}

}
