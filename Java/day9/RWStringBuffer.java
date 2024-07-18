package day9;

public class RWStringBuffer {
	
	StringBuffer str = new StringBuffer(); 
	boolean hasValue = false;

	public synchronized void write(String str1) {
		if (hasValue)
		{
			try { 
				wait();
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.str.append(str1+ " ");
		System.out.println("Write String: " + str.toString());
		hasValue=true;
		notify();
	}

	public synchronized void read() {
		if(!hasValue)
		{
			try {
				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Read Sting :" + str.toString());
		hasValue =false;
		notify();
		
	}

}
