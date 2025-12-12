package RTO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MasterLogin {
	
    public static WebDriver driver;
	  
	public static WebDriver openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankur\\OneDrive\\Desktop\\Selenium\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	
//	driver.get("https://practice.expandtesting.com/dropdown");  // for dropdown
	return driver;
	}
	
	
//    public static WebDriver login() throws InterruptedException {
//    	
//    	driver.manage().window().maximize();
//     	driver.get("https://www.saucedemo.com/");
//    	
//    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
//    	WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		userName.sendKeys("standard_user");
//		passWord.sendKeys("secret_sauce");
//		
//		WebElement clicklogin= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//		clicklogin.click();
//		Thread.sleep(2000);
//    	
//    	return driver;
//  }
	
	
	
	public static WebDriver login() throws InterruptedException {
//		driver.get("https://practice.expandtesting.com/dropdown");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,250)", "");
		
		
		return driver;
	}
}
	
 

	

