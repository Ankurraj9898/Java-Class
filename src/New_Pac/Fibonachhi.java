package New_Pac;

public class Fibonachhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 10;
		
		int tem=0;
		int fib=1;
		
		for (int i=1; i<=num; i++) {
			
			int a = tem+fib;   //1
			 tem=fib;
			 fib=a;
	         
			 System.out.print(a+",");
		}
	}

}
