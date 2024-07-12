package day4;

public class Customer {
	private int cusid;
	private String name;
	private double balance;
	private double minbalance=5000;
	private double limit=20000;
	
	public Customer(int cusid, String name, double balance)
	{
		this.cusid=cusid;
		this.name=name;
		this.balance=balance;
	
	}
	
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinbalance() {
		return minbalance;
	}

	public double getLimit() {
		return limit;
	}
}
