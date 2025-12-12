package Ankur;

import java.util.Scanner;

public class Find_Vovels {

	public static void main(String[] args) {

		String str = "Hello how are you";

		String st = "aeiouAEIOU";

		String vo = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			for (int j = 0; j <= st.length() - 1; j++) {
				if (str.charAt(i) == st.charAt(j)) {
                  vo=vo+str.charAt(i);
				}
			}
		}
		
		System.out.println(vo.length());

	}
}
