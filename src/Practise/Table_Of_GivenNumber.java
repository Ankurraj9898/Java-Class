package Practise;

import java.util.Scanner;

public class Table_Of_GivenNumber {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
         for ( int i=1; i<=10; i++) {
        	 
        	 System.out.println( n +"x"+ i+"=" +(2*i));
         }

  }
}