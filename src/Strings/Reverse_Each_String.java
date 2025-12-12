package Strings;

public class Reverse_Each_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String str = "Hello My Name Is Rohan";
		
//	System.out.println (str.length());
	
		String [] word= str.split(" ");
	
//		System.out.println (word.length);
		
		String reverse= "" ;
		
		for (String words : word) {
			
			
			for (int i=words.length()-1; i>=0; i--){
				
				reverse = reverse+ words.charAt(i) ;
				
			}
			
			reverse = reverse+ " ";
		}
		
	       System.out.print( reverse);
	  }
	}

