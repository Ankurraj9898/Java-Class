 package inheritanceTwo;

import org.openqa.selenium.By;

public class LoginRepo extends MasterClass{
	
//	WebDriver driver;
	
//	public LoginRepo(WebDriver driver) {
//		
//		this. driver= driver;
//		
//	}
	 
	 public void addToCart() {
		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	 }

}
