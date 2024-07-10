package day3;

public class Cart{
	double totalBill=0;
	int count =0;
	public void addtocart( Dessert dessert)
	{
		totalBill+=dessert.calculatePrice();
		count++;
	}
	public void showbill()
	{
		System.out.println("Total no. of items purchased: "+count+" Totat bill: "+totalBill );
	}
	public void resetBill()
	{
		totalBill=0;
		count=0;
	}
	
}
