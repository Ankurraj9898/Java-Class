package Java;

public class LoopPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.print("hello");

		int num = 50;

		for (int i = 2; i <= num; i++) {
			
			int primeNumber = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					primeNumber++;
				}
			}

			if (primeNumber == 2) {
				System.out.print(i + ",");

			}
			
			
		}
	}

}
