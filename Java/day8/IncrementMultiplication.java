package day8;

public class IncrementMultiplication {

	public static void main(String[] args) {
		int num1 = 2, num2 = 3;
		
		new Thread3(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Add : " + (i + num1));
					try {
						Thread3.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		Thread3 t1 = new Thread3(() -> {
			for (int i = 1; i < 11; i++) {
				System.out.println("Multiplication : " + (i * num2));
				try {
					Thread3.sleep(500);				
					} catch (InterruptedException e) 
				{					
						e.printStackTrace();
				}
			}
		});
		t1.start();
	}

}
