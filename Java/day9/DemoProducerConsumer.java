package day9;

public class DemoProducerConsumer {
	
		public static void main(String[] args )
		{
			MyQueue  queue =new MyQueue();
			Thread producer =new Thread(new Runnable() {
					@Override
					public void run() {
						for (int i =0;i<10;i++)
						{
							queue.setValue(i);
							try {
								Thread.sleep(2000);
							}catch(InterruptedException e)
							{
								e.printStackTrace();
							}
						}
					}
				});
			

		Thread consumer =  new Thread(new Runnable() {
			@Override
			public void run()
			{
				for(int i=1;i<10;i++)
				{
					queue.getValue();
					try {
						Thread.sleep(2000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					}
				}
			
		});
		producer.start();
		consumer.start();

	}

}
