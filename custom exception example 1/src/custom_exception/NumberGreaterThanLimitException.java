package custom_exception;

public class NumberGreaterThanLimitException extends Exception {

	public NumberGreaterThanLimitException(String message) {

		super(message);
		System.out.println(message);

	}

}
