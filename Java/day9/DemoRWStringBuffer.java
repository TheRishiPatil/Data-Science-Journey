package day9;

public class DemoRWStringBuffer {
	
	public static void main(String[] args) 
	{
		RWStringBuffer sb1 = new RWStringBuffer();  
		
		Thread t1 = new Thread(new Runnable() {  
			@Override
			public void run() {
				for (int i =0;i<2;i++)
				{
					sb1.write("pizzaa"); 
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i =0;i<2;i++)
				{
					sb1.read();
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();
	}
	
}
