package Strings;

public class Return_Test {
	
	public int summ(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	String ob;
	
	public String string(String userName) {
		    ob=userName;
			return ob;
	}
	

	public static void main(String[] args) {
		
		Return_Test obj= new Return_Test();
        int re=obj.summ(5,9);
        System.out.println(re);
        
        String returnStr= obj.string("My name is Ankur");
        System.out.println(returnStr);
        		
        
        
	}

}
