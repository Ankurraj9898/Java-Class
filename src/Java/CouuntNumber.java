package Java;

public class CouuntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num= 1484546878;
		int sum=0;
		
		while (num >0) {
			
			num = num/10;
			sum++;
		}
		
		System.out.print(sum);
	}

}
