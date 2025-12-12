package Strings;

public class A {

	int rollNo;
	String name;
	int mobileNo;

	public A(int rollNo, String name, int mobileNo) {

		this.rollNo = rollNo;
		this.name = name;
		this.mobileNo = mobileNo;

	}

	public void message() {
		System.out.println("Roll no is " + rollNo);
		System.out.println("Name is  " + name);
		System.out.println("Mobile No " + mobileNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(78, "Ankur", 989857221);
		a.message();

		A b = new A(90, "Rohan", 389857221);
		b.message();

	}

}
