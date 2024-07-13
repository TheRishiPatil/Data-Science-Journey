package day5;

public class Account implements Comparable<Account>{
	int id;
	String name;
	int balance;
	String IFSC;
	public Account(int id, String name, int balance, String IFSC)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.IFSC=IFSC;
	}
	
	@Override
	public String toString()
	{
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + " , IFSC=" + IFSC + "]";
	}

	@Override
	public int compareTo(Account a) {
		return this.id-a.id;
	}
	
}
