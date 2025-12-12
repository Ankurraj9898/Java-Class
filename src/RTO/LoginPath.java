package RTO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPath  {

	WebDriver driver;
	
	public LoginPath(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void getWebSite () {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	public void enterUsername () throws InterruptedException {
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	public void enterPassword() throws InterruptedException {
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passWord.sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	public void clickLogin () throws InterruptedException {
		WebElement clicklogin= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		clicklogin.click();
		Thread.sleep(2000);
	}
//	
	
	
//	LoginPath(WebDriver driverr) {
//		super(driverr);
//		// TODO Auto-generated constructor stub
//	}

	public void backBack() {
		
		WebElement bag = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		
		bag.click();
	}
	
	public void clickCart () {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}
}
