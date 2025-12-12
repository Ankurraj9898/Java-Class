package ppractise;

public class AgenotvalidException extends Exception {
	public AgenotvalidException(String message) {
		super(message);
	}
}

class CustomeException {
	static void validateAge(int age) throws AgenotvalidException {
		if (age < 18) {
			throw new AgenotvalidException("Your age is not vliad for Votng");
		} else {
			System.out.println("Your age is valid");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(16);
		} catch (AgenotvalidException e) {
			e.printStackTrace();
		} finally {
			System.out.println("My code is working");
		}
		System.out.println("Code is working even after Exception");
	}
}
