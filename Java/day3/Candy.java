package day3;

public class Candy extends Dessert {
	public Candy (String name, double quantity, double price)
	{
		super(name,quantity,price);
	}
	
	@Override
	public double calculatePrice()
	{
		double totalprice = (quantity/1000)*price;
		return totalprice;
	}
	
}
