package array;

public class Calculate_Sum_ofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {24,34,24,43,99};
		
		int b= a[0];
		
		for (int i=1; i<a.length; i++) {
			
			b= b+a[i];
			
		}
		System.out.print(b);
		
		
	}

}
