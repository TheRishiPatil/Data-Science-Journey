package day8;
public class DemoEvenOdd {
	
	public static void main(String[] args) {
		
		ThreadEvenOdd evenOdd = new ThreadEvenOdd();
		Thread t1 = new Thread(evenOdd, "Even");
		Thread t2 = new Thread(evenOdd, "Odd");
		t1.start();
		t2.start();
		
	}
}