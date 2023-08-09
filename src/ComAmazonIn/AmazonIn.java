package ComAmazonIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIn {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");  //(1)to launch the URL
		
		Thread.sleep(2000);               //(2) to stop for few seconds
		
		driver.manage().window().maximize(); //(3) to maximize current WebPage
		
		System.out.println("driver.getCurrentUrl()");//(4)to Retrieve the current URL on console window
		
//or we can use other approach to getCurrentUrl on Console Window
		String str =driver.getCurrentUrl(); //to Retrieve the current URL on console window
		System.out.println(str);
				
		driver.getTitle();               //(5)to get the Title of the current WebPage
		System.out.println(driver.getTitle());
		
//or we can use another approach to getTitle of the current WebPage on console window	
		String str1 = driver.getTitle();
		System.out.println(str1);
		
		driver.navigate().to("https://youtube.com"); //(6)to open another WebPage 
		
		driver.navigate().back();     //(7) to go back form current page to Previous WebPage
		
		String str2 =driver.getCurrentUrl();
		System.out.println(str2);
		String str3 = driver.getTitle();
		System.out.println(str3);
		
		driver.navigate().forward(); 	//(8) to go forward from current page 
		driver.navigate().refresh(); 	//(9) to refresh the WebPages
		
		driver.close();    //(10) to Close the WebPages
		
	

	}

}
