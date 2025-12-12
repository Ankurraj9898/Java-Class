package New_Pac;
public class Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 16;
		
		int odd=0;
		
		for (int i=1; i<=17; i++) {
			
			if ( num%i==0) {
			 	odd++;
			}
		}
		
		if (odd==2) {
		   System.out.println(num+ " is a oadd number");
		}else {
			System.out.println(num+ " is a not a oadd number");
		}
		
	}

}
