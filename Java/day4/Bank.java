package day4;

public class Bank {

	public double withdraw(double bal,  double amt, double minbal) throws InsufficientBalanceException
	{
		if (bal - amt < minbal)
		{
			throw new InsufficientBalanceException("Insufficient balance to withdraw!!!");
		}
		return bal-amt;
	}
	
	public double deposit(double amt, double lim, double bal) throws DepositLimitExceededException
	{
		if (amt > lim)
		{
			throw new DepositLimitExceededException("Over the limit to deposit money!");
		}
		return bal + amt;	
	}
	
	public static void main(String[]  args)
	{
		
		Customer bk1= new Customer(101,"pooja",6000);
		Bank b1 = new Bank();
		double bal = bk1.getBalance();
		double minbal = bk1.getMinbalance();
		double lim = bk1.getLimit();
		try 
		{
			b1.withdraw(bal,8000, minbal);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
		
		try 
		{
			b1.deposit(40000, lim, bal);
		}
		catch(DepositLimitExceededException e)
		{
			System.out.println(e);
		}
		
	}
}
