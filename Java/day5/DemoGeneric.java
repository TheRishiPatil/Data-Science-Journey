package day5;

//<T> is type parameter at the time of init.
public class DemoGeneric<T> {
	
	T obj; //any valid type
	public DemoGeneric(T obj)
	
	{
		this.obj=obj;
	}
     public String getName()
     {
    	 return obj.getClass().getName();
      }
     
     public static void main(String[] args)
     {
    	 DemoGeneric<Integer> iobj = new DemoGeneric<Integer>(100);
         System.out.println(iobj.getName());
         
         DemoGeneric<String> sobj = new DemoGeneric<String>("test");
         System.out.println(sobj.getName());
     
     }


}


