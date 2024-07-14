package day6;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
public class DemoIntStream {
	
	public static void main(String[] args) 
	{
		int [] arr = {23,7,10,89,44,56,76,28,97,11,34,23,7,10,34};
		IntStream istream = Arrays.stream(arr);
		
		//intermediate operations
		long distinctele = istream.distinct().count();
		System.out.println(distinctele);
		
		
		//terminal operation
		istream = Arrays.stream(arr);
		long allele = istream.count();
		System.out.println(allele);
		
		istream = Arrays.stream(arr);
		istream.distinct().sorted().forEach((n) -> System.out.println(n));
		
		istream = Arrays.stream(arr);
		List<Integer> squares = istream.distinct().sorted().map((n) -> n*n).boxed().collect(Collectors.toList());
		System.out.println(squares);
		
		istream = Arrays.stream(arr);
		List<Integer> even = istream.distinct().filter((n) -> n%2==0 ).boxed().collect(Collectors.toList());
		System.out.println(even);
		
		
		//optional stream
		istream = Arrays.stream(arr);
		OptionalInt min = istream.min();
		if(min.isPresent())
			System.out.println(min.getAsInt());
		
		istream = Arrays.stream(arr);
		OptionalInt max = istream.max();
		if(max.isPresent())
			System.out.println(max.getAsInt());
		
		istream = Arrays.stream(arr);
		OptionalDouble ave = istream.average();
		if(ave.isPresent())
			System.out.println(ave.getAsDouble());
		
		istream = Arrays.stream(arr);
		OptionalInt fa = istream.findAny();
		if(fa.isPresent())
			System.out.println(fa.getAsInt());
		
		
	}
}
