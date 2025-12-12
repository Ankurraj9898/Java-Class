package Practise;


    class Test{
	
	String Name;
	String Number;
	
	public String getName(String namee) {
		
		return namee;
	}
	
	public void getNumber(String num) {
		
		System.out.println (num);
	}
		
}


public class Default_Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test ();
		
//		obj.getName("rohan");
		
		
		String objj=obj.getName("rohan");
		
		System.out.println (obj.getName(null));
	}

}
