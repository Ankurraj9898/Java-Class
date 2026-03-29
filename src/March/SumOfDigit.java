package March;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num = 86524;
		 int b =0;
		 
		 while (num>0) {
			 
			int c = num%10;
			 b= b+c;
			num =num/10;
		 }

		 System.out.println("Sum number is :" + b);
	}

}
