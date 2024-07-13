package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(100);
		lst.add(345);
		lst.add(786);
		lst.add(112);
		
		Integer j = lst.get(0);
		System.out.println(j);
		
		lst.remove(2);
		System.out.println(lst);
		
		for (int i=0; i<lst.size(); i++ )
		{
			System.out.println(lst.get(i));
		}
		for(Integer n : lst)
		{
			System.out.println(n);
		}
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
		Collections.sort(lst);
		System.out.println(lst);
		
		System.out.println();
		System.out.println(Collections.min(lst));
		System.out.println(Collections.max(lst));
	}	
}