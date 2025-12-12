package twoDArray;

public interface Testing {

	public void test1();
	public void test();
	
	public static void test3() {
		System.out.println("This is static method of interface");
	};
	
	public default void method() {
		System.out.println("Thiss is interface default method");
	}
}
