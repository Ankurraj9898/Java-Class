package Strings;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "WELCOME";
		String vowels= "aeiouAEIOU";
		
		for (int i=0; i<str.length();i++) {
			
		//	char ch=str.charAt(i);
			
			for (int j =0; j<vowels.length();j++) {
				
				if(str.charAt(i)==vowels.charAt(j)) {
					System.out.print(str.charAt(i)+",");
				}
			}
		     
		}
		
		
	}

}
