package Java;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 343553;
		
		int temp;
		int res = 0;
		
		while(num>0) {
			 
			temp= num%10;
			res=res+temp;
			num=num/10;
		}
		
		System.out.println(res);
		
	System.out.println("HEllo Word");
	}

}
