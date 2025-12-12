package inheritance;

public class ChromeDriver implements WebDriver {
	
	 public ChromeDriver() {
		 System.out.println("This is Constructor");
	 }

	@Override
	public void methoa1() {
		System.out.println(" Method of ChromeDriver 1 ");

	}

	@Override
	public void method2() {
		System.out.println(" Method of ChromeDriver 2 ");

	}

	@Override
	public void method3() {
		System.out.println(" Method of ChromeDriver 3 ");
	}

	@Override
	public void method4() {
		System.out.println(" Method of ChromeDriver 4 ");

	}

}
