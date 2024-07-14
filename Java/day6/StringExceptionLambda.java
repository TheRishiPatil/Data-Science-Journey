package day6;

public class StringExceptionLambda {
	
	public static boolean operateOnString(StringPredicate func, String s) throws EmptyStringException
	{
		if(s=="")
			throw new EmptyStringException("String is Empty");
		else
			return func.verifyString(s);
			
		
	}

	public static void main(String[] args) {
		//String s="Lambda add power to java";
		String s = "";
		
		try {
			System.out.println(operateOnString((str) ->  str.equals(s),s));
		} catch (EmptyStringException e)
		{
			e.printStackTrace();
		}
		
	}
}
