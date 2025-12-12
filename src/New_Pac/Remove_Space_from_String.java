package New_Pac;

public class Remove_Space_from_String {
	
	public static void main(String []args) {
		
		String str= "Hello how are you";
		String []a = null;
		
		for (int i=0; i<=str.length()-1;i++) {
			
			 a= str.split(" ");
		}
		
		for (int j=0; j<=a.length-1; j++) {
			
			System.out.print(a[j]);
		}
	}
	
	
}

