package array;

public class Reverse_Element_Array {

	public static void main(String[] args) {

		int[] a = { 55, 44, 23, 23, 65, 34, 9,99,78 };

		int[] b = new int[9];

//		System.out.print(a[8]);ss

		for (int i =0; i<=a.length-1;i++) {

		   b[i]= a[i];
//		   System.out.print(b[i]+",");
			
//			System.out.print(a[i]+",");
			
		}
		
		for (int j=b.length-1; j>=0; j--) {
			System.out.print(b[j]+",");
		}

	}
}