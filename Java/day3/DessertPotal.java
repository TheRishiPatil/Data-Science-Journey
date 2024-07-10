package day3;
import java.util.*;
 

	public class DessertPotal {  
		public static void main(String args[])
		{
			
			Scanner sc = new Scanner(System.in); 
			Dessert dessert;
			Cart c = new Cart();
			//boolean flag=true;		
			int ch = 0;
			while(ch!=4) 
			{
				System.out.printf("1. Candy \n2. Cookies \n3. Ice Cream \n4.Exit \n Enter Choice : ");
					ch = sc.nextInt();
					
					switch(ch) {
					  	case 1:
					  		System.out.println("Enter Dessert name: ");
							String name = sc.next();
						
							System.out.println("Enter quantity: ");
							double quantity = sc.nextDouble();
						
							System.out.println("Enter price: ");
							double price = sc.nextDouble();
					  		dessert = new Candy(name, quantity, price);
					  		c.addtocart(dessert);
					  		break;
					    
					  	case 2:
					  		System.out.println("Enter Dessert name: ");
							String name2 = sc.next();
						
							System.out.println("Enter quantity: ");
							double quantity2 = sc.nextDouble();						
							System.out.println("Enter price: ");
							double price2 = sc.nextDouble();
					  		dessert = new Cookies(name2, quantity2, price2);
					  		c.addtocart(dessert);
					  		break;
				  		
					  	case 3:
					  		System.out.println("Enter Dessert name: ");
							String name3= sc.next();
						
							System.out.println("Enter quantity: ");
							double quantity3 = sc.nextDouble();
							
							System.out.println("Enter price: ");						
							double price3 = sc.nextDouble();
							dessert = new Cookies(name3, quantity3, price3);
							c.addtocart(dessert);
					  		break;
					   
					  	case 4:
					  		System.out.println("Thank you!!!!");
					  		c.showbill();
					  		c.resetBill();
					  		//flag=false;
					  		break;
					    
					  	default:
					  		System.out.println("Invalid");
					}
				}	          
		}
	}