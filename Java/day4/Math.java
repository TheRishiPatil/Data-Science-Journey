package day4;

public class Math {
	
	public static void main(String[] args)
	{
		try {
				int dividend = Integer.parseInt(args[0]);
				int divisor = Integer.parseInt(args[1]);
				
				int q = dividend/divisor;
				System.out.println(q);
			}
			catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("After exception");
		
	}
}
