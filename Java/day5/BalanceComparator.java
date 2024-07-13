package day5;
import java.util.Comparator;

public class BalanceComparator implements Comparator<Account>{
	@Override
	public int compare(Account a1, Account a2)
	{
		if(a1.balance<a2.balance)
		{
			return -1;
		}
		else if(a1.balance>a2.balance)
		{
			return 1;
		}
		else
		{
			return 0;
		}
			
	}

	
}
