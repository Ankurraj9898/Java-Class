package Practise;



interface ParentInterface {
    void parentMethod();
}

// Child Interface extending Parent Interface
interface ChildInterface extends ParentInterface {
    void childMethod();
}

// Class implementing ChildInterface (which also inherits ParentInterface)
class MyClass implements ChildInterface {
    // Implementing parent interface method
    public void parentMethod() {
        System.out.println("This is Parent Interface Method");
    }

    // Implementing child interface method
    public void childMethod() {
        System.out.println("This is Child Interface Method");
    }
}



public class MultippleInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		   MyClass obj = new MyClass();
		   
		   ParentInterface objj = new MyClass();

	        // Calling methods
	        objj.parentMethod();  // From ParentInterface
//	        objj.childMethod();   // From ChildInterface
	    }
	}

