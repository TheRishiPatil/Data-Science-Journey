package day5;
//T is bounded
public class Stat <T extends Number>{
	T [] arr;
	public Stat(T [] arr)
	{
		this.arr=arr;
	}
	public double getAverage()
	{
		double sum = 0.0;
		for(int i =0; i<arr.length; i++)
		{
			sum+=arr[i].doubleValue();
		}
	   return sum/arr.length;
	
	}
	public boolean isAveEqual(Stat<?> obj)  //?  (wild card) represents unknown type
	{
		if(this.getAverage()==obj.getAverage())
			return true;
		else
			return false;
	}
	public static void main(String[] args)
    {
    	 Integer []  iarr = {1,2,3,4,5};
    	 Double [] darr = {1.0, 2.0, 3.0, 4.0, 5.0};
    	 
    	 Stat<Integer> iobj = new Stat<>(iarr);
    	 Stat<Double> dobj = new Stat<>(darr);
    	 
    	 System.out.println(iobj.getAverage());
    	 System.out.println(dobj.getAverage());
    	 
    	 System.out.println(iobj.isAveEqual(dobj));
 
    }
}
