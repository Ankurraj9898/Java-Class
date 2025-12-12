
public class largestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]  a= {10,36,9,67,8,45,99,23,89};
		
		int largest=a[0];
		
		for (int i=0; i<=a.length;i++) {
		
			if( a[i]>largest) {
				largest=a[i];
			}
		}
		
		System.out.println(largest);
	}

}
