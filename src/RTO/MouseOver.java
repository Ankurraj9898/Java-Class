package RTO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver extends MasterLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;

		driver=openBrowser();
		driver=login();
		

		
		
//		Alert alert= driver.switchTo().alert();
//		
//		alert.dismiss();
		
		WebElement userName = driver.findElement(By.name("password"));
//		
		Actions action = new Actions (driver);
		
		
		action.moveToElement(userName).perform();
		
	//	action.doubleClick(userName).perform();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File srcFile =sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("./ScreenShots/Image1.png"));
		
	}

}
