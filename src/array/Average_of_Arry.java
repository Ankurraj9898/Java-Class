package array;

public class Average_of_Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {12,32,45,54,43};
		double b=0;
		int count=0;
		
		for(int i=0; i<a.length;i++) {
			b= b+a[i];
			count++;
		}
		
		System.out.print(b/count);
		
		
	}
}
