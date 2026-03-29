package Java;

public class Print_Dublicate_Char {

	public static void main(String[] args) {
		
		String str = "apple is fruit";
		
		char[] chr= str.toCharArray();
		
		for(int i=0; i<chr.length-1;i++) {
			
			for (int j=i+1; j<chr.length;j++) {
				
				if (chr[i]==chr[j]) {
					System.out.println(chr[j]);
				}
			}
			
//			System.out.print(str.charAt(i)+",");
		}
	}

}
