package Practise;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =154;
		int numm=num;
		int temp;
		
		int sum=0;
		
		
		while(num>0) {
			 
			temp=num%10;
			sum= sum+(temp*temp*temp);
			num=num/10;
		}
		
		if (numm==sum) {
			
			System.out.println(numm +" is a ArmStrongNumber");
		}else {
			
			System.out.println(numm + " is not a armstrong number");
		}
    }
	
}
	

