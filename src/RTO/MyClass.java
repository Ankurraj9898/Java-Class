package RTO;


interface Parent {

    default void sayHello (){
    	System.out.print("This is Parent");
  }
}   
    interface GrndP{
    	
    	default void  sayHello () {
    		
    		System.out.println("");
    	}
    }

//class Child implements Parent,GrndP {

//    public void sayHello () {
//    System.out.print("This is child");
//  }
//}


public class MyClass implements Parent, GrndP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Child ob = new Child ();
		
//		ob.sayHello();
		
		
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		GrndP.super.sayHello();
	}

}




