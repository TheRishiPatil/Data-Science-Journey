package day6;

public class DemoLambda {
	
			public static boolean verifyNumber(NumberFunc func, int n)
			{
				return func.checkNumber(n);
			}
			
			public static String operateOnString(StringFunc func, String str)
			{
				return func.getString(str);
			}
			
	
			public static void main(String[] args)
			{
				
			  NumberFunc ispositive = (n) -> n>=0;
			  
			  if(ispositive.checkNumber(10))
				  System.out.println("number is positive");
			  
			  
			  
			  //multiple line lambda
			  NumberFunc isprime = (n) ->
			  {
				  for(int i=2; i<n; i++)
				  {
					  if(n%i==0)
						  return false;
				  }
				  return true;
			  };
			  System.out.println(isprime.checkNumber(12)); 
			  
			  System.out.println(verifyNumber((n) -> n%2==0, 10));
			  
			  System.out.println(verifyNumber((n)->
			  {
				  for(int i=2; i<n; i++)
				  {
					  if(n%i==0)
						  return false;
				  }
				  return true;
			  }, 10));
			  
			  System.out.println(verifyNumber(Math::isPrime, 14));
			  System.out.println(operateOnString(StringReverse::reverseString, "ai"));
			  
			 //lower to upper case
			 System.out.println("lower to upper case: ");
			 System.out.println(operateOnString((str) ->
			 	{
				  String result1="";
				  result1 = str.toUpperCase();
				  return result1;
			 	}, "pooja"));
		
			 
			 
			 
			 //reversing string
			  StringFunc reverseString = (str) -> 
			  	{
				  String result="";
				  for(int j=str.length()-1; j>=0; j--) 
				  {
					  result = result + str.charAt(j);
				  }
				  return result; 
			  	};
			  System.out.println("String reverse: ");
			  System.out.println(reverseString.getString("pooja"));
			  
			  
			  
			  //upper to lower case
			  StringFunc lowerString = (str) -> 
			  {
				  String result="";
				  result = str.toLowerCase();
				  return result;
			  };
			  System.out.println("upper to lower case:");
			  System.out.println(lowerString.getString("POOJA"));
			  			
			  
			  
			  
			  
			  
			  
//			  StringFunc upperString = (str) -> 
//			  {
//				  String result1="";
//				  result1 = str.toUpperCase();
//				  return result1;
//			  };
//			  System.out.println("String lower to upper case:");
//			  System.out.println(upperString.getString("pooja"));
//			  
					  
	  }
}
