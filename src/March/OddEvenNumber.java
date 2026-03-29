package March;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		System.out.print("Enter the Number :");
		Scanner scn = new Scanner(System.in);
	
		int num = scn.nextInt();
		
		if (num%2==0) {
			
			System.out.println(num +" This number is even number");
		} else {
			System.out.println(num +" This number is Odd number");
		}

	}

}
