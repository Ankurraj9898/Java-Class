package New_Pac;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number : ");
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		int ans=0;
		
		for (int i=num; i>=2; i--) {
			
			for(int j=num-1; j>=1; j--) {
			
				 ans = ans+(i*j);
			}
		}

		System.out.println(ans);
	}

}
