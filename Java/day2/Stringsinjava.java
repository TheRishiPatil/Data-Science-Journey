package day2;

public class Stringsinjava {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		
		String n1 = new String("python");
		String n2 = new String("python");
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s2: "+s2.hashCode());
		s2=s2+"8";
		System.out.println(s2.hashCode());
	}
	
}
