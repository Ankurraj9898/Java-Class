package RTO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPath2 {

	WebDriver driver;
	
	
	public LoginPath2 (WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkOut () {
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	}
}
