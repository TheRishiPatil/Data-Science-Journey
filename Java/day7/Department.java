package day7;

public class Department {
	private String name;
	private String department;
	public Department(String name, String department)
	{
		super();
		this.name=name;
		this.department=department;
	}
	@Override
	public String toString()
	{
		return "Department [name=" + name + ", department=" + department + "]";
	}
}
