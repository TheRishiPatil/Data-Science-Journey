package day5;

import java.util.Set;

public class Employee implements Comparable<Employee>{
	int empid;
	String name;
	double salary;
	Set<String> skills;
	public Employee(int empid, String name, double salary, Set<String> skills)
	{
		this.empid= empid;
		this.name=name;
		this.salary=salary;
		this.skills =skills;
	}
	@Override
	public String toString()
	{
		return "Employee  [empid=" + empid + ", name=" + name + ", salary=" + salary + " , skills=" + skills + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}
}
