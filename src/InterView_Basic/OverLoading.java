package InterView_Basic;

class ParentClass {

	String str;

	public void run() {
		System.out.println("Bike is running");
	}

	public String run(String bike) {
		System.out.println(bike + " is running very slow");
		return bike ;
	}
}

class ChildClass extends ParentClass{
	public void run(int a) {
		System.out.println("Car is running");
	}
	
	public void cry() {
		System.out.println("Child is crting");
	}
}

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass ob = new ParentClass();
		ob.run("Honda");
		
		ParentClass obb = new ChildClass();
	
		
	}

}
