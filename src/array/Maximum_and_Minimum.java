package array;

public class Maximum_and_Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 55, 44, 23, 23, 65, 34, 9, 2, 99 };

		int b = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > b) {
				b = a[i];
			}

		}

		System.out.print(b);
	}

}
