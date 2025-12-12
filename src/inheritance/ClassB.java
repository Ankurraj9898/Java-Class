package inheritance;

public class ClassB extends Casting {

	public void m2() {
    	System.out.println("Method 2 calling");
    }
	
	
	public static void main(String[] args) {
		
		Casting obj = new ClassB();
//		obj.m1();
		
		ClassB b= (ClassB) obj;
		b.m2();
		b.m1();
		
			
		
	   }
	}
