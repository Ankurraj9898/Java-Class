package RTO;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\ankur\\OneDrive\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/dropdown");
//		Thread.sleep(2000);
				
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("Window.scrollBy(0,200)");
		
		
//		WebElement dropDown = driver.findElement(By.id("elementsPerPageSelect"));
//		
//		Select select =  new Select (dropDown);
//		
//        Thread.sleep(2000);
//		
//		List<WebElement> ob= select.getAllSelectedOptions();
//		
//		System.out.println(ob);
//		
//		driver.quit();
		
		driver.findElement(By.id("elementsPerPageSelect")).click();	
		
		
       	List <WebElement> ob= driver.findElements(By.xpath ("//*[@id=\"elementsPerPageSelect\"]/option"));
		
		for(WebElement list : ob) {
			
			System.out.println (list);
		}
		
		driver.quit();
	}
	

}
