package inheritance;

public class MasterClass {
	
	
	
	WebDriver driver;
	
    public WebDriver launchBrowser() {
    	driver = new ChromeDriver();
		return driver;
    	
    }

}
