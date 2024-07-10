package day3;

public abstract class Dessert {
	
	protected String name;
	protected double quantity;
	protected double price;
	
	public Dessert(String name, double quantity, double price)
	{
		this.name=name;	
		this.quantity=quantity;
		this.price=price;
	}
	
	public abstract double calculatePrice();
	
	public String toString()
	{
		System.out.println("Thank you for purchasing!!!");
		return "\nQuantity: " + quantity + "\nName: " + name + "\nPrice: " + price;
	}

}

