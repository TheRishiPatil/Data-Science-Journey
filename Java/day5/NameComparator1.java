package day5;

import java.util.Comparator;

public class NameComparator1 implements Comparator<Account>{
	 
	@Override
	public int compare(Account a1, Account a2)
	{
		return a1.name.compareTo(a2.name);
	}
}