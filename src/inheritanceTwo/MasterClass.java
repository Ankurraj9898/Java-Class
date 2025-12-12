package inheritanceTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterClass {
	
	public  WebDriver driver;
	public  WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankur\\OneDrive\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	 
	
	public WebDriver login() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		return driver;
	}
}
