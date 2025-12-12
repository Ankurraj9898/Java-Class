package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter the number : ");
		
		int num= scn.nextInt();
		int res = 0;
		
		for (int i=1; i<=num; i++) {
			
			if (num%i==0) {
				res++;
				
				
			}
		}
		
		if (res==2) {
			
			System.out.print("The given number "+ num+ " is prime number");
		}else {
			
			System.out.print("The given number "+ num+ " is not prime number");
		}
	}

}
