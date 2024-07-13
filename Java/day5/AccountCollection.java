package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccountCollection {
	public static Map<String, Account> getFilterByIFSC(List<Account> lst)
	{
		Map<String, Account> ifscmap = new HashMap<>();
		for(Account e : lst)
		{
			if(e.IFSC == "UCO40128")
			{
				ifscmap.put(e.name,e);
			}
		}
		return ifscmap;
	}
	
	public static Map<String, Account> getFilterByBalance(List<Account> lst)
	{
		Map<String, Account> balancemap = new HashMap<>();
		for(Account e : lst)
		{
			if(e.balance> 45000)
			{
				balancemap.put(e.name,e);
			}
		}
		return balancemap;
	}
	
	public static void main(String[] args)
	{
		//1. list of accounts
		List<Account> lst = new ArrayList<>();
		lst.add(new Account(565, "diya", 50000,"UCO40128"));
		lst.add(new Account(276, "teja", 45000, "SBI40128"));
		lst.add(new Account(456, "pooja", 60000, "SBI40128"));
		
		//printing list
		for(Account a : lst)
			System.out.println(a);	
	    
		//sorting by id  
		Collections.sort(lst);		
		System.out.println("\n********Sort by id********");
		for(Account a : lst)
			System.out.println(a);
		
		//3. binary search
		int found = Collections.binarySearch(lst, new Account(565, null, 0, null));
		System.out.println(found);
	
		//sorting by name
		Collections.sort(lst, new NameComparator1());
		System.out.println("\n********Sort by name********");
		for(Account a : lst)
			System.out.println(a);
		
		//sorting by balance
		Collections.sort(lst, new BalanceComparator());
		System.out.println("\n********Sort by balance********");
		for(Account a : lst)
			System.out.println(a);

		Map<String, Account> ifscmap = getFilterByIFSC(lst);
		System.out.println();
		System.out.println("\n********Filter account by ifsc********");
		System.out.println(ifscmap);
		
		Map<String, Account> balancemap = getFilterByBalance(lst);
		System.out.println("\n********Filter account by balance********");
		System.out.println();
		System.out.println(balancemap);
		
		
	}
}


