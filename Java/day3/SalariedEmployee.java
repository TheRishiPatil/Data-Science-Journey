package day3;

public class SalariedEmployee extends Employee implements Taxpayer{
	
	public double basic;
	
	public SalariedEmployee (int empid, String name, double basic)
	{
		super(empid, name);
		this.basic=basic;
	}

	@Override
	public double calculateGross()
	{
		double hra=basic*0.4;
		double da=basic*0.12;
		return basic+hra+da;
	}
	
	public double calculateNet()
	{
		double tax=calculateTax();
		//double tax=calculateGross()*0.2;
		return calculateGross()-tax;
	}
	
	public String toString()
	{
		return super.toString() + "\nGross :" + calculateGross() + "\nNet :" + calculateNet();
	}
	
	//interface used
	public double calculateTax()
	{
		return calculateGross()*0.2;
	}
}
