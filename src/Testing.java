
class Testing {

	public void parentMethod() {
		System.out.println("Parent class is called");
	}

}

class Child extends Testing {

	public void childMethod() {
		System.out.println("Parent class is called");
	}
}

class Main {
	public static void main(String[] args) {

		Testing tst = new Child();
		tst.parentMethod();

	}
}