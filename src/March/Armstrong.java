package March;

public class Armstrong {

	public static void main(String[] args) {

		int a = 153;
		int num = 0;
		
//		System.out.println(a/10);

		while (a > 0) {

			int b = a % 10;
			num = num + b * b * b;
			a = a / 10;

		}

		System.out.println("Print : "+num);
	}

}
