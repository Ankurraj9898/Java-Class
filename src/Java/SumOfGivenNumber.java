package Java;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);	    // 987
	    System.out.print("Enter the number : ");
	    
	    int num= scn.nextInt();
	    int var;
	    
	    int sum=0;
	    while(num>0) {
	    	
	    	sum= sum+( num%10);
	    	num=num/10;
	    }
	    
	    System.out.println("The sum is " + sum);
	
	}

}
