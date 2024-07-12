package day4;

public enum Coffee {
	
	SMALL(50),MEDIUM(75),LARGE(100);
	int price;
	private Coffee(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
}

