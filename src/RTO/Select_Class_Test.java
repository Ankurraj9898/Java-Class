package RTO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_Test extends MasterLogin {

	MasterLogin master = new MasterLogin();
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		MasterLogin master = new MasterLogin();
		driver=master.openBrowser();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	   
		Thread.sleep(1000);
		
		
//		Select select = new Select(driver.findElement(By.id("dropdown")));
//		select.selectByIndex(1);
//		Thread.sleep(1000);
	
		
//		WebElement element = driver.findElement(By.id("dropdown"));
		
		List <WebElement> list = driver.findElements(By.xpath("//*[@id=\"dropdown\"]"));
		
//		System.out.println(list);
		
		for (WebElement option : list) {
		    
			
			System.out.println(option.getText());
			
			if(option.getText().equals("Option 1")) {
				
				option.click();
				break;
			} else {
				System.out.println("-----------Code is not working---------------");
			}
		}
		driver.close();

	}


}
