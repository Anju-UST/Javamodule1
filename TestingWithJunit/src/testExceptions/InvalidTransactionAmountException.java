package testExceptions;

public class InvalidTransactionAmountException extends RuntimeException {
	
	private static final long serialVersionUID=1;
	
	public InvalidTransactionAmountException(String message) {
		super(message);
	}
}
