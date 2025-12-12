package New_Pac;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 346898569;
		int count=0;
		
		while(a>0) {
			a=a/10;		
			count++;
		}
		
		System.out.print(count);
	}

}
