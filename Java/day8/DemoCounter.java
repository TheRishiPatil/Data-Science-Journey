package day8;

public class DemoCounter {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Thread one = new Thread(new Runnable(){
			@Override
			public void run() 
			{
				synchronized (c) 
				{
					for(int i=0;1<50;i++) 
					{
						int count= c.increment();
						System.out.println(Thread.currentThread().getName()+" : "+ count);
						try {
						Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});

		Thread two = new Thread(new Runnable(){
			@Override
			public void run()
			{
				synchronized(c)
				{
					for(int i=0; i<50; i++)
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
			}
		});
		
		
		one.start();
		two.start();
		
	}

}

