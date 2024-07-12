package day4;
import java.util.Scanner;

public class CoffeeShop {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("***************Menu****************");
		
		Coffee[] coffees = Coffee.values();
		for(Coffee cof : coffees)
		{
			System.out.println(cof);
		}
		
		System.out.println(("*************************************"));
		System.out.println("Enter your choice: small/medium/large");
		String choice=sc.next();
		System.out.println("Enter quantity: ");
		int qty = sc.nextInt();
		//Coffee c = Coffee.SMALL()
		
		Coffee c= Coffee.valueOf(choice.toUpperCase());
		switch (c){
		case SMALL:
			System.out.println("Bill: " + qty * c.getPrice());
			break;
			
		case MEDIUM:
			System.out.println("Bill: " + qty * c.getPrice());
			break;
			
		case LARGE:
			System.out.println("Bill: " + qty * c.getPrice());
			break;
		}
		
		//Coffee ch= Coffee.SMALL;
	}
	
}
