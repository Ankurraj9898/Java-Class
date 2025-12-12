package InterView_Basic;

  class ParentClasss{
	 public void bark() {
		 System.out.println("Parent class is barking");
	 }
 
  public void sleep() {
		 System.out.println("Parent class is sleeping");
	 }
  
  }  
  class ChildClasss extends ParentClasss {
		 public void bark() {
			 
//			 super.bark();
			 System.out.println("Child class is barking");
		 }
		 
		 public void eat() {
			 System.out.println("ANimal class is barking");
		 }
	 }

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClasss ob = new ChildClasss();
		ob.bark();
		ob.sleep();
		
		
		
//		ParentClasss ob2= new ParentClasss();
//		ob2.bark();
//		
//		ChildClasss obj3= new ChildClasss();
//		obj3.bark();
		
		
	}

}
