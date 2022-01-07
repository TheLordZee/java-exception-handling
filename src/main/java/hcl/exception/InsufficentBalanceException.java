package hcl.exception;

public class InsufficentBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficentBalanceException(String errorMessage) {
		super(errorMessage);
	}
}
