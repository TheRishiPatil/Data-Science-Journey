package day3;

public class Cookies extends Dessert{
	
	public Cookies (String name, double quantity, double price)
	{
		super(name,quantity,price);
	}
	
	@Override
	public double calculatePrice()
	{
		double totalprice = (quantity * price)/12;
		return totalprice;
	}
	
	
}
