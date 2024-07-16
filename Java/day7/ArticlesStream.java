package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticlesStream {

	public static List<Articles> getArticles()
	{
		List<Articles> artlst = new ArrayList<>();
		artlst.add(new Articles("AIforEducation","AI",2000,2022));
		artlst.add(new Articles("HomeAutomation","IOT",1000,2023));
		artlst.add(new Articles("Metamask","BLOCKCHAIN",4000,2021));
		artlst.add(new Articles("Thermodynamics","MECH",1500,2021));
		artlst.add(new Articles("AIforHealth","AI",700,2023));
		return artlst;
		
	}
	public static void main(String[] args) {
		
		List<Articles> artlst = getArticles();
		Stream<Articles> estream = artlst.stream();
		estream.forEach(System.out::println);

		//1. Articles created in 2023
		System.out.println("\n***** 1. Articles created in 2023 *****");
		Predicate<Articles> year = (art) -> art.getYears()==2023;
		estream = artlst.stream();
		estream.filter(year).forEach(System.out::println);
		
		//2. Articles for subject = AI
		System.out.println("\n***** 2. Articles for subject -> AI *****");
		estream = artlst.stream();
		Predicate<Articles> sub = (art) -> art.getSubject()=="AI";
		estream.filter(sub).forEach(System.out::println);
		
		
		//3. Group articles by subject
		System.out.println("\n***** 3. group articles by subject *****");
		estream = artlst.stream();
		Map<String, List<Articles>> sub1 = estream.collect(Collectors.groupingBy(Articles::getSubject));
		System.out.println(sub1);
		
	
		//4. count articles by subject
		System.out.println("\n***** 4. Counting articles by subject *****");
		estream = artlst.stream();
		Map<String, Long> subcount = estream.collect(Collectors.groupingBy(Articles::getSubject, Collectors.counting())); 
		subcount.forEach((Subject , Count )-> System.out.println(Subject+":" + Count));
	
		
		//5. Counting articles with views more than 1k
		System.out.println("\n***** 5. Counting articles with views more than 1k *****");
		estream = artlst.stream();
		Predicate<Articles> views = (art) -> art.getViews()>1000;
		estream = artlst.stream();
		estream.filter(views).forEach(System.out::println);
	
		
		//6. Group and count articles by subject
		System.out.println("\n***** 6. Group and count articles by subject *****");
		estream = artlst.stream();
		Map<String, Long> sub3 = estream.collect(Collectors.groupingBy(Articles::getSubject, Collectors.counting()));
		sub3.forEach((Subject , Count )-> System.out.println(Subject+":" + Count));

	
	}

}
