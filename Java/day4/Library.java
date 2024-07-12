package day4;
import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> books;
	
	public Library(List<Book> books)
	{
		this.books=books;
	}
	
	public void addBook(Book b) throws DuplicateBookException
	{
		for(Book bb:books)
		{
			if(bb.getIsbn()==b.getIsbn())
			{
				throw new DuplicateBookException("Book already exist");
			}
		}
		books.add(b);
	}
	
	public static void main(String[]  args)
	{
		List<Book> books = new ArrayList<>();
		books.add(new Book(101,"java8","pooja"));
		books.add(new Book(102,"java9","prasad"));
		
		Library lib= new Library(books);
		try 
		{
			lib.addBook(new Book(102,"java9","prasad"));
		}
		catch(DuplicateBookException e)
		{
			System.out.println(e);
		}
		
	}
}
