package array;

public class Copy_Element_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {23,33,23,65,23,55};
		
		int[] b= new int[6];
		
		for (int i=0; i<a.length;i++) {
		
			b[i]= a[i];
			System.out.print(b[i]+",");
		}
		
		
		
		
	}

}
