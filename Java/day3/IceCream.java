package day3;

public class IceCream extends Dessert{
	
	public IceCream (String name, double quantity, double price)
	{
		super(name,quantity,price);
	}
	
	@Override
	public double calculatePrice()
	{
		double totalprice = quantity * price;
		return totalprice;
	}
	
	public String displayBill()
	{
		return super.toString();
	}
	
}
