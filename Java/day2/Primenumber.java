package day2;

public class Primenumber {
	
	public static void main(String[] args) {
		int n =12;
		int flag=0;
		int a = n/2;
		if(n==0 || n==1)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			for(int i=2; i<=a ; i++)
				if(n%i==0)
				{
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
		}
		if(flag==0)
		{
			System.out.println("It is a prime number");
		}
		     
	}

}
