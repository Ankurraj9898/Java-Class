package inheritance;

public class loginClass {

	WebDriver driver;
	
	public loginClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginMethod1() {
		driver.method2();
	}
}
