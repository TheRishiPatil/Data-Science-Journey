package day9;
public class DemoBank {
	int balance;

	public void depositeAndWithdraw(int balance) {
		this.balance = balance;
	}
	
	
	public synchronized void withdraw(int amt) {
		if(this.balance < amt) {
			try {
				System.out.println("Insufficient Balance : " + this.balance);
				System.out.println("Waiting for deposite");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance -= amt;
		System.out.println("Withdraw complete");
		System.out.println("Balance : " + this.balance);
		notify();

	}
	public synchronized void deposite(int amt) {
		this.balance += amt;
		System.out.println("Deposite complete");
		System.out.println("Balance : " + this.balance);
		notify();
	}

