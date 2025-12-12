package Strings;

public class Reverse_Each_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = " Hello My Name Is Lakhan";
		
		String[] strr= str.split(" ");
		
		for ( String a : strr) {
			
			for ( int i=a.length()-1; i>=0; i--) {
			
				System.out.print(a.charAt(i));
			}
			
			System.out.print(" ");
		}
	}

}
