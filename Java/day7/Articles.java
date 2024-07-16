package day7;

public class Articles implements Comparable<Articles>{
	private String name;
	private String subject;
	private double views;
	private int years;
	
	public Articles(String name, String subject, double views, int years) 
	{
		this.name=name;
		this.subject=subject;
		this.views=views;
		this.years=years;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getViews() {
		return views;
	}

	public void setViews(double views) {
		this.views = views;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	@Override
	public String toString()
	{
		return "Articles  [name= " + name + ", subject= " + subject + ", views= " + views + " , years= " + years + "]";
	}

	@Override
	public int compareTo(Articles o) {
		return 0;
	}

}
