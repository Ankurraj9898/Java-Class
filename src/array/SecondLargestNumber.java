package array;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] a = { 55, 44, 23, 23, 65, 34, 9, 2, 99 };
		
		int b=a[0];
		int c=a[0];
		
		for (int i=1; i<a.length; i++) {
			if(a[i]> b) {
				b=a[i];
			}
			
			for (int j=1; j<a.length; j++) {
				if(a[j]>c && a[j]<b) {
					c=a[j];
				}
			}
		}
		
		System.out.println(c);

	}

}
