package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeCollection {
	public static Map<String, Set<String>> getSkilledEmployees(List<Employee> emplist)
	{
		Map<String, Set<String>> skillmap = new HashMap<>();
		for(Employee e : emplist)
		{
			if(e.skills.contains("java"))
			{
				skillmap.put(e.name,e.skills);
			}
		}
		return skillmap;
	}
	
	public static void main(String[] args)
	{
		Set<String> skills1 = new TreeSet<String>();
		skills1.add("java");
		skills1.add("javascript");
		
		Set<String> skills2 = new TreeSet<String>();
		skills2.add("java");
		skills2.add("javascript");
		
		Set<String> skills3 = new TreeSet<String>();
		skills3.add("c++");
		skills3.add("python");
		
		List<Employee> emplst = new ArrayList<>();
		emplst.add(new Employee(555, "aaa", 50000, skills1));
		emplst.add(new Employee(222, "sss", 45000, skills2));
		emplst.add(new Employee(888, "ppp", 60000, skills3));
		
		for(Employee e : emplst)
			System.out.println(e);
		
		Collections.sort(emplst);
		System.out.println("********Sort by id********");
		for(Employee e : emplst)
			System.out.println(e);
		
		int found = Collections.binarySearch(emplst, new Employee(555, null, 0, null));
		System.out.println(found);
		
		Collections.sort(emplst, new NameComparator());
		System.out.println("********Sort by name********");
		for(Employee e : emplst)
			System.out.println(e);
		
		
		Map<String, Set<String>> skillmap = getSkilledEmployees(emplst);
		System.out.println(skillmap);
		
		
	}
}

