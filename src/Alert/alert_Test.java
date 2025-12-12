package Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().reset();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/alertsDemo.html");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankur\\OneDrive\\Desktop\\Selenium\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		

	}

}
