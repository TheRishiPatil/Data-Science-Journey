package day8;

public class DemoThread {

	public static void main(String[] args) {
		
		//using lambda
		new Thread3(() -> {
			for(int i =0;i<10;i++)
			{
				System.out.println("thread using lambda : " + i);
				try {
					Thread3.sleep(2000);
				} catch (InterruptedException e) {
				   e.printStackTrace();
				}
			}
		}).start();
				
		
		//using thread class
		Thread3 t1 = new Thread1("new thread 1");
		t1.start();
		
		
		//using runnable 
		Thread3 t2 = new Thread3(new Thread2("new thread 2"));
		t2.start();
		
		System.out.println(t1.isAlive());
		for(int i =0;i<10;i++)
		{
			System.out.println("main thread : " + i);
			try {
				Thread3.sleep(2000);
			} catch (InterruptedException e) {
			   e.printStackTrace();
			}
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
