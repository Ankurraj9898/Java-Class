package Alert;

public class ChromeDriverr implements WebDriverInterFace, ScreenShot_InterFace {

	public ChromeDriverr() {
		System.out.println("ChromeDriver Constructor is calling");
	}

	@Override
	public void method1() {
		System.out.println(" ChomeDriver method1 Executed as per Webdriver");

	}

	@Override
	public void method2() {
		System.out.println(" ChomeDriver method2 Executed as per Webdriver");

	}

	@Override
	public void snapShot2() {
		System.out.println("SnapeShotMethod is running");
	}

	public void chromeMethod() {
		System.out.println("This is chromeDriver method");
	}
}
