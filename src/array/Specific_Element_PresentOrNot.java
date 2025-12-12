package array;

public class Specific_Element_PresentOrNot {

	public static void main(String[] args) {

		int[] a = { 23, 44, 12, 45, 12, 65 };

		int b = 46;

		boolean found = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b) {

				found = true;
			}
		}

		if (found) {

			System.out.print("Element is found");

		} else {
			System.out.print("Element is not found");
		}

	}

}
