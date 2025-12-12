package Java;

import java.util.Scanner;

public class Fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter the number you wished : ");
		int num = scn.nextInt();
		
		
		// 0,1,1,2,3,5,8,13,21
		
		int temp = 0;
		int temp2= 1;
		
		int res;
		
		System.out.print(temp+",");
		
		for ( int i=0; i<=num; i++) {
			
			res= temp+ temp2;
			System.out.print(res +",");
			
			 temp=temp2;
			 temp2=res;
					
		}
	}

}
