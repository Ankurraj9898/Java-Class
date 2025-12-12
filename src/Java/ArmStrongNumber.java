package Java;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		
		System.out.print("Enter a Number : ");
		
		int num= scn.nextInt();     //153
		
		int temp= num;
		
		int var;
		
		int result=0;
		
		 while (num>0){
			
			 var=num%10;
			 result = result+ (var*var*var);
			 num=num/10;
		}
		
		 if (temp==result) {
			 System.out.println("Thee given number "+ temp+ " is armstrong");
		 }else {
			 System.out.println("Thee given number "+ temp+ " is not armstrong");
		 }
		 
		
	}

}
