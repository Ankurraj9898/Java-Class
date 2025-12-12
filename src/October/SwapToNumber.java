package October;

public class SwapToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a= 20;
		int b= 30;
		
		System.out.println("Before value of a= 20, b=30");
		
		a= a+b;   //  a=50
		b= a-b;    // b= 20
		a= a-b;   
		
		System.out.println("Noe value of a= "+a+ " and b= " + b);
	}

}
