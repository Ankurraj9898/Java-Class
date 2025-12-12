package Practise;

import java.util.Scanner;

public class Fibonachhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=10;
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		int sum=0;
		
		for (int i=1; i<=num ; i++) {
			
			
			num3= num1+num2;
			
			num1=num2;
			num2=num2;
		
			System.out.print( num3 + ", ");
		}

		
		 
	}

}
