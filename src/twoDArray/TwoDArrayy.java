package twoDArray;

public class TwoDArrayy {

	public static void main(String[] args) {

		int[][] a = { { 4, 6 }, { 5, 7, 8 }, { 9, 10, 22, 23 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	

	}

}
