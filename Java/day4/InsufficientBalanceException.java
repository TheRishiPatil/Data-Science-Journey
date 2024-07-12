package day4;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}