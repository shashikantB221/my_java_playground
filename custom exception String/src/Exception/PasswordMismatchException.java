package Exception;

public class PasswordMismatchException extends Exception {

	public PasswordMismatchException(String msg) {
		super(msg);
		System.out.println("Try again");

	}
}
