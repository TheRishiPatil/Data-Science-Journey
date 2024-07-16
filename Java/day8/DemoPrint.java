package day8;

public class DemoPrint {

	public static void main(String[] args) {
		
		Print p1 = new Print();
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,20,30,40,50};
		
		Thread pt1 = new Thread(new Runnable(){
			@Override
			public void run() 
			{
				synchronized (p1) 
				{
					 p1.printArray(arr1);
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
		
		
		
		Thread pt2 = new Thread(new Runnable(){
			@Override
			public void run() 
			{
				synchronized (p1) 
				{
					 p1.printArray(arr2);
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
		
		
		pt1.start();
		pt2.start();

	
	}

}