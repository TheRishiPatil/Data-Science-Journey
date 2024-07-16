package day8;

public class EvenOddThread {
	
	public static void main(String[] args) {
		
		Thread3 t1 = new Thread3(new Runnable(){
			@Override
			public void run() 
			{
				for(int i=1;i<21;i++)
				{ 
					if ( i%2==0) {
						System.out.println(Thread3.currentThread().getName() + " " + i);
					}		
				}	
			}
		},"Even Thread: "); t1.start();
		
		
		
		Thread3 t2 = new Thread3(new Runnable(){
			@Override
			public void run() 
			{
				for(int i=1;i<21;i++)
				{ 
					if ( i%2!=0) {
						System.out.println(Thread3.currentThread().getName() + " " + i);
					}
				}	
			}
		},"Odd Thread:"); t2.start();	

	}

}
