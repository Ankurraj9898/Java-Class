package inheritanceTwo;

import inheritance.WebDriver;

public class MainLogin {
	WebDriver driver;

	public static void main(String[] args) {

		LoginRepo obj = new LoginRepo();

		obj.openBrowser();
		obj.login();
		obj.addToCart();

	}

}
