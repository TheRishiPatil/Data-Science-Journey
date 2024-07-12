package day4;

public class NewMath {
	public static void divide(String st1, String st2) throws ArithmeticException, ArrayIndexOutOfBoundsException 
	{
		int dividend = Integer.parseInt(st1);
		int divisor = Integer.parseInt(st2);
		
		int q = dividend/divisor;
		System.out.println(q);
	}
	
	
	public static void main(String[] args)
	{
			try {
					divide(args[0], args[1]);
				}
			catch (ArithmeticException e)
			{
				System.out.println("Divisor can not be zero");
			
			}
			catch (NumberFormatException e)
			{
				System.out.println("Please enter only integers");
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Enter two values- dividend and divisor");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("After exception");
			
			
			
	}	
		
}
