package day9;

import java.util.concurrent.BlockingQueue;

public class QueueReader implements Runnable{
	BlockingQueue<String> queue;

	public QueueReader(BlockingQueue<String> queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i =0; i<5;i++)
		{
			try {
				String value = queue.take();
				System.out.println("Thread " + name + " got " + value);
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}
