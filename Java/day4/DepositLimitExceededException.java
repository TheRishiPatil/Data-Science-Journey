package day4;

public class DepositLimitExceededException extends Exception{
	public DepositLimitExceededException(String message)
	{
		super(message);
	}
}
