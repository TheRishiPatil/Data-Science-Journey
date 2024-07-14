package day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Colours {

	    public static void main(String args[]) 
	    {  
	    	List<String> str =  Arrays.asList("Red", "Orange", "Yellow", "Green" , "Blue" , "Indigo" , "Violet");
	    	Stream<String> mystream = str.stream();
	    	
	    	//upper
	    	List<String> upper = mystream.map(s->s.toUpperCase()).collect(Collectors.toList());
	    	System.out.println(upper); 
	    	
	    	//lower
	    	mystream = str.stream();
	    	List<String> lower = mystream.map(l->l.toLowerCase()).collect(Collectors.toList());
	    	System.out.println(lower);
	    	
	    	mystream = str.stream();
	    	List<String> asce = mystream.filter(a->a.toLowerCase().charAt(0)<'m').sorted().collect(Collectors.toList());
	    	System.out.println(asce);
	    	
	    	mystream = str.stream();
	    	List<String> desc = mystream.filter(a->a.toLowerCase().charAt(0)<'m').sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    	System.out.println(desc);
	    	
	    	mystream = str.stream();
	    	List<String> aescnew = mystream.filter(a->a.length()<=5).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    	System.out.println(aescnew);
	    	
	    }  
}
