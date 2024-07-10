package day3;

public class Manager extends SalariedEmployee {
	protected static double allow=1500;
	
	public Manager (int empid, String name, double basic)
	{
		super(empid, name,basic);
	}
	@Override
	public double calculateGross()
	{
		//double hra=basic*0.4;
		//double da=basic*0.12;
		//return basic+hra+da+allow;
		return super.calculateGross() + allow;
	}
	public double calculateNet()
	{
		double tax=calculateGross()*0.2;
		return calculateGross()-tax;
	}

}
