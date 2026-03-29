package March;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number : ");
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int ver = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				ver++;
			}
		}

		if (ver == 2) {
			System.out.println(num + " The number is prime number");
		} else {
			System.out.println(num + " The number is not prime number");
		}
	}

}
