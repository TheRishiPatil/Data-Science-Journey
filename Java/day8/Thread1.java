package day8;

public class Thread1 extends Thread3{
    
	String name;
	public Thread1(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(name + " " + i);
			try {
				Thread3.sleep(2000);
			} 
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}	
	}
}
