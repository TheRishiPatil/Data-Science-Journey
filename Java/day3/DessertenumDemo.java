package day3;

import java.util.Scanner;


public class DessertenumDemo {

	public static void main(String[] args) {
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("***************Menu****************");
			
			Dessertenum[] dessert = Dessertenum.values();
			for(Dessertenum des : dessert)
			{
				System.out.println(des);
			}
			
			System.out.println(("*************************************"));
			System.out.println("Enter your choice: candy/cookies/icecream");
			String choice=sc.next();
			System.out.println("Enter quantity: ");
			int qty = sc.nextInt();
			
			Dessertenum c= Dessertenum.valueOf(choice.toUpperCase());
			switch (c){
			case CANDY:
				System.out.println("Bill: " + c.calculatePrice());
				break;
				
			case COOKIES:
				System.out.println("Bill: " + c.calculatePrice());
				break;
				
			case ICECREAM:
				System.out.println("Bill: " + c.calculatePrice());
				break;
			}
			
		}
	}
	
	
	

}
