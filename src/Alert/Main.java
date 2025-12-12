package Alert;

public class Main {

	public static void main(String[] args) {
		
		WebDriverInterFace driver= new ChromeDriverr();
		
		driver.method1();
		
		ScreenShot_InterFace sc= (ScreenShot_InterFace) driver;
		
		sc.snapShot();
		sc.snapShot2();
		
		ChromeDriverr ob =(ChromeDriverr) driver;
		
		ob.chromeMethod();
		
		int numm= driver.num;
		
		System.out.println(numm);
	}

}
