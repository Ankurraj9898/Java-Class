package March;

public class Finding_Commen_Array {

	public static void main(String[] args) {

		int[] num = { 54, 55, 45, 33, 64, 89 };

		int[] num2 = { 85, 39, 45, 44, 54, 89 };

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num2.length; j++) {
                
				if (num[i]==num2[j]) {
					
					System.out.print(num[i]+",");
				}
			}
		}

	}

}
