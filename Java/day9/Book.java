package day9;

public class Book {
	private final int isbn;
	private String title;
	
	public Book() {
		isbn = 107483;
		title = "java 8";
	}

	public Book(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	
	public static void simplePrivateMethod() {
		System.out.println("This is private Method");
	}
	
	public static void simpleStaticMethod() {
		System.out.println("This is a static Method");
	}
	
	@MyAnno(priority = 1)
	public void simpleMethod()
	{
		System.out.println("This is public method");
	}
	public void setValue(int isbn, String name)
	{
		System.out.println(new Book(isbn,name).toString());
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ",title=" + title + "]";
	}
}
