package day9;

public class Bank {

	public static void main(String[] args) {
		DemoBank daw = new DemoBank(10000);
		Thread withdraw = new Thread(new Runnable() {
			@Override
			public void run() {
				daw.withdraw(50000);
			}
		});
		Thread deposite = new Thread(new Runnable() {
			@Override
			public void run() {
				daw.deposite(45000);
			}
		});
		withdraw.start();
		deposite.start();
	}

}
