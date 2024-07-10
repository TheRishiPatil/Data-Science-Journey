package day3;

public class EmployeePortal {
	
	public void showNet(SalariedEmployee e) 
	{
		System.out.println("Gross salary: " + e.calculateNet());
	}
	
	public void showGross(Employee e) 
	{
		System.out.println("Net salary: " + e.calculateGross());	
	}
	
	public void showNet(SalesManager e1) 
	{
		System.out.println("Gross salary: " + e1.calculateNet());
	}
	
	
	public static void main(String[] args) {
		EmployeePortal portal=new EmployeePortal();
//		SalesManager se = new SalesManager(101,"diya",50000);
		//System.out.println(se.calculateGross());
		//System.out.println(se.calculateNet());
		//System.out.println(se.toString());
		
//		System.out.println(se);
//		portal.showGross(se);  //upcasting
//		portal.showNet(se);
		
		Manager em = new Manager(433,"pooja", 60000);
		System.out.println(em);
		
		Employee [] emps = new Employee[3];
		emps[0]= new SalesManager(222,"prasad",80000,2000);
		emps[1]= new Manager(333,"pizza",60000);
		emps[2]= new SalariedEmployee(444,"chiku",70000);
		
		for(Employee e : emps)
		{
			portal.showGross(e);
			if(e instanceof SalariedEmployee)
			{
				SalariedEmployee ss = (SalariedEmployee) e; //down casting
				if(ss instanceof SalesManager) {
					SalesManager se = (SalesManager) ss;
					se.displayIncentive();
				}
				
				portal.showNet(ss);
			}                                      
		}
		
		                                 
		
		
		
		
	}
	
	

}