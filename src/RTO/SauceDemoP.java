package RTO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\ankur\\\\OneDrive\\\\Desktop\\\\Selenium\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
//		List link =driver.findElement(By.tagName("a"));
	}

}
