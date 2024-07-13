package day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
	//set can be sorted by using tree set
	//for list hash set
	public static void main(String[] args)
    {
		Set<String> set = new HashSet<>(); //any order
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("two");
		
		System.out.println(set);
		set.remove("two");
		System.out.println(set);
		
		set.add("four");
		//for each used as no indexing
		for(String s : set )
		{
			System.out.println(s);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it);
		}
    }
    
}
 