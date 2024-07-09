package day2;

public class StringMethods {
	public static void main(String[] args) 
	
	{
		String s ="Welcome to java";
		System.out.println(s.charAt(3));
		
		System.out.println(s.compareTo(" "));
		
		String[] strs = s.split("+");
		for(String str: strs)
		{
			System.out.println(str);
		}
	}
	
}
