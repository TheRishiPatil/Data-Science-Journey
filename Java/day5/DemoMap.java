package day5;

import java.util.HashMap;
import java.util.Map;

//keys can be unique
public class DemoMap {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<>();
		map.put("one", 100);
		map.put("two", 200);
		map.put("three", 300);
		map.put("one", 400);
		
		System.out.println(map);
		
		//to retrieve key used
		System.out.println(map.get("one"));
		map.remove("two");
		System.out.println(map);
		map.remove("two",200);
		
		//for iteration 
		//keySet used to get keys
		

	}

}
