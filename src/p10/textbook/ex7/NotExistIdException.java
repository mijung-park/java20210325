package p10.textbook.ex7;

public class NotExistIdException extends Exception{
	public NotExistIdException() {
		
	}
	
	public NotExistIdException(String message) {
		super(message);
	}
}
