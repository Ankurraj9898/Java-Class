package casting_Java;

class Animal {
	public void vegAnimal() {
		System.out.println("Only all vegitarian animals eat Grass");
	}
}
class Tiger extends Animal {
	public void eating() {
		System.out.println("Tiger is not eating grass");
	}
}
public class Casting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-----------------------------------------------------------------------------------
//		Animal veg = new Animal();
		
//		veg.vegAnimal();                 // its a working
//		veg.eating();                    // not working	 
//-----------------------------------------------------------------------------------
		Animal veg2 = new Tiger ();
		Tiger tig = (Tiger) veg2;      // downcasting
		
		tig.vegAnimal();
		tig.eating();
		
		
		veg2.vegAnimal(); 
//		veg2.eating();          // not working
		
		
//-----------------------------------------------------------------------------------
		
		Tiger tiger = new Tiger();
		
		tiger.vegAnimal();             //  working
		tiger.eating();                  // working
//-----------------------------------------------------------------------------------
		
		
		
		
		
	}

}
