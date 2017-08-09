package exceptionhandling;

public class NotProperNameException extends Exception {
	private String message;
	
	NotProperNameException(String message){
		this.message = message;
	}
	
	@Override
	public String toString() {
		
		return "MyException[" + message + "]";
	}
}
