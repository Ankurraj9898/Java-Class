package array;

import java.util.ArrayList;
import java.util.List;

public class FindCommenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {4,5,6,7,8,9};
		int[] num2= {1,2,4,9,5,10,11,6};
		List<Integer> cmn= new ArrayList<>();
		
		for (int i=0; i<num.length;i++) {
			
			for (int j=0; j<num2.length;j++) {
				
				if (num[i]==num2[j]) {
					cmn.add(num[i]);
				}
			}
		}
		
		System.out.print(cmn);
	}

}
