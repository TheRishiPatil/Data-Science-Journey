package day3;

public enum Dessertenum {
	CANDY(50),COOKIES(75),ICECREAM(100);
	int price;
	private Dessertenum(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}

	double calculatePrice() {
		int qty = 1;
		double totalprice = qty * price;
		return totalprice;
	}
}
