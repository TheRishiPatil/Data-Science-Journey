package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeStream {
	
	public static List<Employee> getEmployees()
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
		emplst.add(new Employee(555, "aaa", 50000,"IT", skills1));
		emplst.add(new Employee(222, "sss", 45000,"IT", skills2));
		emplst.add(new Employee(888, "ppp", 60000,"Sales", skills3));
		return emplst;
		
	}

	public static void main(String[] args) {
		
		List<Employee> emplist = getEmployees();
		Stream<Employee> estream = emplist.stream();
		estream.forEach(System.out::println);
		
		System.out.println("***** Sorting by ID *****");
		estream = emplist.stream();
		estream.sorted().forEach(System.out::println);
		
		System.out.println("\n***** Sorting by Name *****");
		estream = emplist.stream();
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		estream.sorted().forEach(System.out::println);
	
	
		System.out.println("\n***** Sorting by Name Dept-wise *****");
		estream = emplist.stream();
		Comparator<Employee> bydeptname = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
		estream.sorted(bydeptname).forEach(System.out::println);
		
		System.out.println("\n***** Dept-wise employee list *****");
		Function<Employee, Department> depts = (emp) -> new Department(emp.getName(), emp.getDepartment());
		estream = emplist.stream();
		estream.map(depts).forEach(System.out::println);
		
		System.out.println("\n***** Employee list with sal >= 50000 *****");
		Predicate<Employee> salrange = (emp) -> emp.getSalary()>=50000;
		estream = emplist.stream();
		estream.filter(salrange).forEach(System.out::println);
		
		System.out.println("\n***** Employee list with skills -> Java *****");
		estream = emplist.stream();
		Predicate<Employee> skills = (emp) -> emp.getSkills().contains("java");
		estream.filter(skills).forEach(System.out::println);
		
		System.out.println("\n***** Min/Max/Ave/Total sal *****");
		estream = emplist.stream();
		OptionalDouble max = estream.mapToDouble(Employee::getSalary).max();
		if(max.isPresent())
			System.out.println("Max salary: " + max.getAsDouble());
		
		estream = emplist.stream();
		OptionalDouble min = estream.mapToDouble(Employee::getSalary).min();
		if(max.isPresent())
			System.out.println("Min salary: " + min.getAsDouble());
		
		estream = emplist.stream();
		OptionalDouble ave = estream.mapToDouble(Employee::getSalary).average();
		if(ave.isPresent())
			System.out.println("Average salary: " + ave.getAsDouble());
		
		estream = emplist.stream();
		double total = estream.mapToDouble(Employee::getSalary).sum();
		if(ave.isPresent())
			System.out.println("Total salary: " + total);
		
		estream = emplist.stream();
		Map<String, List<Employee>> deptemps = estream.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(deptemps);
	
	}

}
