package Ankur;

public class PalinDromee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 5;
		int res = 1;
		
//		char[] num2= String.valueOf(num).toCharArray();		
		
		for (int i=1; i<=num; i++) {
			
			res= res*i;
		}
		
		System.out.println(res);

	}
}
