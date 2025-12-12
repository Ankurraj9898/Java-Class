package RTO;



interface A {
	
	default void methodA(){
		
	     System.out.println("This is a AAAAA Interface");      
	 }
	
	
	    void method3();
	}




	interface B  {
	
	default void methodA () {
		
		System.out.println(" This is BBBBB Interface");
	}
	
}


public class Inteerface implements B,A {

	
	
	public void method3() {
		  System.out.println(" This is method 1 of interface  AA  ");
		
	}
	
	
	

	@Override
	
	 //   Both A and B have same default method with same method name 
	
	
	public void methodA() {
		// TODO Auto-generated method stub
		B.super.methodA();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st

		Inteerface obj = new Inteerface();

		obj.methodA();
		
		obj.method3();
	}
	

	

}
