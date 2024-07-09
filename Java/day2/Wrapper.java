package day2;

public class Wrapper {

	public static void main(String[] args)
	{
		int x=20;
		Integer i = Integer.valueOf(x);
		System.out.println(x);
		
		int y = i.intValue();
		System.out.println(y);
				
		String S = "30";
		int a =Integer.parseInt(S);
		System.out.println(a);
		
		String s="30";
		Integer b = Integer.valueOf(s);
		System.out.println(b);
				
		//autoboxing
		int c=10;
		Integer j =c;
		System.out.println("c:"+c);
		System.out.println("j:"+j);
	    
		//autounboxing
		int d=j;
		System.out.println("d:"+d);
		
	}
}