package March;

public class Shorting {

	public static void main(String[] args) {

		int[] array = { 6, 3, 8, 2, 9, 6 };

		int temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					temp = array[i];

					array[i] = array[j];

					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

}
