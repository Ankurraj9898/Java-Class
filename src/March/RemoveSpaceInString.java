package March;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		
		String str = "Hello i am Removing space";
		
		for (int i=0; i<str.length();i++) {
			
				if (str.charAt(i)!=' ') {
					
					System.out.print(str.charAt(i));
				}
		}

	}

}
