package RTO;

import org.openqa.selenium.WebDriver;

public class SauceDemo extends MasterLogin  {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver;
		
//		LoginPath loginnn = new LoginPath();    // When Login class Extends Master classs
//		loginnn.openBrowser();
//		loginnn.login();
//		loginnn.backBack();
		
		
		SauceDemo ob = new SauceDemo ();
		
		
		driver = ob.openBrowser();
		
		LoginPath obj = new LoginPath(driver);
		obj.getWebSite();
		
		obj.enterUsername();
		obj.enterPassword();
		obj.clickLogin();
		obj.backBack();
		obj.clickCart();
		
		driver.close();
		
//		LoginPath2 obj2 = new LoginPath2 (driver);
//		obj2.checkOut();
	}
	


}
