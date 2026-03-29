package March;

public class ReverseNumber {

	public static void main(String[] args) {
	
		String str = "Now string is going to reverse ";
		
		System.out.print("Reverse string is : ");
		 
		for(int i=str.length()-1; i>0; i--) {
			
			System.out.print( str.charAt(i));
		}

	}

}
