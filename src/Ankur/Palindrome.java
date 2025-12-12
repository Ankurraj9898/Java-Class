package Ankur;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madamm";
		String pal= "";
		
		for (int i=str.length()-1; i>=0; i--) {
			pal= pal+str.charAt(i);
		}
		if(str.equals(pal)) {
			System.out.print("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

}
