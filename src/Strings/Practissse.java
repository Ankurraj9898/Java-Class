package Strings;

public class Practissse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello Madam";
	
		String word="";
		
		for (int i=0;i<str.length();i++) {
			
			if(str !=" ") {
				
				word = word+str.charAt(i);
			}
		}
		System.out.print(word);
	}

}
