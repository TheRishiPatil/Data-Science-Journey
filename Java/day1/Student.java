package day1;

public class Student{
	
	private String name;
	private String dept;
    private int ID;
    private static int count=0;


    public Student()
    {
        name="Pratiksha";
        dept="AI";
        ID= 21;
    }

    public Student(String name,String dept,int ID)
    {
    	count++;
        this.name=name;
        this.dept=dept;
        this.ID=ID;

    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String toString() {
		return "Student [name=" + name + ", dept=" + dept + ", ID=" + ID + "]";
	}
	public void displayCount()
	{
		System.out.println("Total students "+count);
	}
}