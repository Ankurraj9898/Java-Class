package Java;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);              // 5!= 5x4x3x2x1
		System.out.print("Enter the Number : ");
		int num= scn.nextInt();
		int res=1;
		
		for (int i=1; i<=num; i++)  {
		
			res= res*i;
		}
		
	           System.out.println(res);
	}
}
