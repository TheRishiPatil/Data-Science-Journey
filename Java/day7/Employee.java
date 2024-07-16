package day7;

import java.util.Set;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String name;
	private double salary;
	private Set<String> skills;
	private String department;
	public Employee(int empid, String name, double salary,String department, Set<String> skills)
	{
		this.empid= empid;
		this.name=name;
		this.salary=salary;
		this.skills =skills;
		this.department=department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString()
	{
		return "Employee  [empid=" + empid + ", name=" + name + ", salary=" + salary + " , skills=" + skills + ", department= " + department + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}
}
