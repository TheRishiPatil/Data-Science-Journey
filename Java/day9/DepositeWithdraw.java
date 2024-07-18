package day9;

public class DepositeWithdraw {
	int balance=1000;
	
	public synchronized void deposite(int bal) {
		System.out.print("Balance after deposite: ");
		System.out.println(balance+=bal);
		
	}
	public synchronized void withdraw(int amt) {
		if(balance<amt) {
			try {
				System.out.println("Insufficient Balance...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notify();
			
		}
		else {
			System.out.print("Balance after withdraw: ");
			balance = balance-amt;
			System.out.println(balance);
			notify();
		}
	}

}
