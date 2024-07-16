package day8;

public class AnnoThreads {

	public static void main(String[] args) {
		
		//using anonymous 
		//Thread t1 = new Thread(new Runnable(){
		// }); t1.start();
		//or given as below
		
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread().getName() + " " + i);
					try {
						Thread.sleep(2000);
					} 
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}	
			}
		}).start();
		
		
		//using lambda 
		Runnable tt = () -> {
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.sleep(2000);
				} 
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}	
		};
		Thread t1 = new Thread(tt);
		t1.start();
	
	}
}
