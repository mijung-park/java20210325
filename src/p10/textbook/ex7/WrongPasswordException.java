package p10.textbook.ex7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}

}
