package October;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the value : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();   //a =153
		int v = a;
		
		int b=0;
		
		while(a>0) {
			int c= a%10;
			b= b+c*c*c;
			a= a/10;
		}
		
	     System.out.println("Result is " + b);
		
		if (v==b) {
			System.out.println(" Value of "+v+" is a aramstrong number");
		} else {
			System.out.println("The number is not armstrong number");
		}
	}
}
