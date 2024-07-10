package day3;

public interface PrintWrite {
	PrintWrite pw = new PrintWrite();
	default void print()
	{
		System.out.println("Printing the object");
	}
}
