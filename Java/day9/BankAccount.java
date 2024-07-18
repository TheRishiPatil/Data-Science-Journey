package day9;

public class BankAccount {
	public static void main(String[] args){
		DepositeWithdraw dw = new DepositeWithdraw();
		
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				dw.deposite(1000);
			}
		});
		th.start();
		
		
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				dw.withdraw(5000);
			}
		});
		th1.start();
	}
	
	
}
