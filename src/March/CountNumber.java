package March;

public class CountNumber {

	public static void main(String[] args) {

		int num = 23232323;
		int count = 0;

		while (num > 0) {
          
			num = num/10;
			count++;
		}
		
		System.out.println(count);
	}
}
