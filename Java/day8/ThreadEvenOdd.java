package day8;

public class ThreadEvenOdd implements Runnable {
	
	static Thread3 oddThread;
	static Thread3 eveThread;

	@Override
	public void run() {
		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0 && oddThread.currentThread().getName() == "Odd") {
				System.out.println(oddThread.currentThread().getName() + " " + i);
			} 
			
			if (i % 2 == 0 && eveThread.currentThread().getName() =="Even") {
				System.out.println(eveThread.currentThread().getName() + " " + i);
			}
		}

	}
}

