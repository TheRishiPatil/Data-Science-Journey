package day3;

public class Consultant implements Taxpayer {
	private String name;
	private double  invoiceamt; 
	
	public Consultant(String  name, double invoiceamt)
	{
		super();
		this.name=name;
		this.invoiceamt=invoiceamt;
	}
	@Override
	public double calculateTax()
	{
		double sal = invoiceamt*0.10;
		return sal;
	}
	
	@Override
	public String toString()
	{
		return "Consultant[name =" + name + ", invoiceamt =" + invoiceamt + ", salary = " + calculateTax() + "]";
	}
}
