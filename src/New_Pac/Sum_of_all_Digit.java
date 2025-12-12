package New_Pac;

public class Sum_of_all_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=6565;
		int newNum=0;
		
		while (a>0) {
			
			int tem= a%10;
			newNum=newNum+tem;
			a=a/10;
		
		}
		
		System.out.print(newNum);
	}

}
