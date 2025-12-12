package Ankur;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Hello how are you";
		
		String str2="";
		char[] charr= str.toCharArray();
		String newStr="";
		
		for(char ch:charr) {
			
			if(ch!=' ') {
				newStr= newStr+ch;
			}
		}
		
		System.out.print(newStr);
		
		}
	}


