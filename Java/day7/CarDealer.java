package day7;

public class CarDealer {
	private String model;
	private int stock;
	private String colour;
	private int year;
	private double price;
	
	public CarDealer(String model, int stock, String colour, int year, double price)
   {
		this.model = model;
		this.stock = stock;
		this.colour = colour;
		this.year = year;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString()
	{
		return "Cardealer  [model=" + model + ", stock=" + stock + ", colour=" + colour +  ", year= " + year + "price=" + price + "]";
	}
	public int compareTo(CarDealer o) {
		return 0;
	}
}
