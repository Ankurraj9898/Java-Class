package March;

public class SwapNumber {

	public static void main(String[] args) {

		int a = 20;
		int b = 30;

		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);

		a = a + b; // 50
		b = a - b; // 20
		a = a - b; //

		System.out.println("A new value is : " + a);
		System.out.println("B new value is : " + b);
	}

}
