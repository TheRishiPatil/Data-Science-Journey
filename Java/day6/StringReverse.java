package day6;

public class StringReverse {
	public static String reverseString(String str)
	{
		String result="";
	
		  for(int j=str.length()-1; j>=0; j--) 
		  {
			  result = result + str.charAt(j);
		  }
		  return result; 
}
}
