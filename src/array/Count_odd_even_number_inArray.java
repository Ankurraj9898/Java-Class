package array;

public class Count_odd_even_number_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {34,33,19,45,22,46,10};
		
		int even=0;
		int odd=0;
		
		for (int i=0; i<a.length; i++) {
			if(i%2==0) {
				even++;
			}else if(i%2!=0) {
				odd++;
			}
		}
		
		System.out.println("Even count is "+ even);
		System.out.println("Odd count is "+ odd);
	}

}
