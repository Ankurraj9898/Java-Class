package array;

import java.util.ArrayList;
import java.util.List;

public class Remove_Dublicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 45, 55, 32, 32, 98, 34 };

		int[] b = new int[5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					System.out.print(a[j] + ",");
				}
			}
		}
	}
}
