package day8;

public class DemoAtomicCounter {

	public static void main(String[] args) {
		
		AtomicCounter c = new AtomicCounter();
		
		Thread one = new Thread(new Runnable(){
			@Override
			public void run() 
			{
	
				for(int i=0;i<25;i++) 
				{
					int count= c.increment();
					System.out.println(Thread.currentThread().getName()+" :"+ count);
					try 
					{
						Thread.sleep(2000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
			}
		});

		Thread two = new Thread(new Runnable(){
			@Override
			public void run()
			{
					for(int i=0; i<25; i++)
					{
						int count = c.increment();
						System.out.println(Thread.currentThread().getName() + " :" + count);
						try {
							Thread.sleep(2000);
						}
						catch (InterruptedException e){
							e.printStackTrace();
						}
					}
				}
		});
		
		one.start();
		two.start();
		
	}

}

