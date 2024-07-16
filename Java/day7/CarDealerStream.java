package day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarDealerStream {
	
	public static List<CarDealer> getCarDealer()
	{
		List<CarDealer> cdlst = new ArrayList<>();
		cdlst.add(new CarDealer("Fortuner",20, "white", 2021, 4000000));
		cdlst.add(new CarDealer("Altros",30, "white", 2020, 800000));
		cdlst.add(new CarDealer("Thar",10, "black", 2022, 1600000));
		cdlst.add(new CarDealer("Creta",15, "white", 2022, 2000000));
		cdlst.add(new CarDealer("Rangerover",10, "red", 2023, 4000000));
		return cdlst;
		
	}

	public static void main(String[] args)
	{
		List<CarDealer> cdlst = getCarDealer();
		Stream<CarDealer> estream = cdlst.stream();
		estream.forEach(System.out::println);
		
		//1. Stock for a specific model and color
		System.out.println("\n***** Stock for a specific model and color *****");
		Predicate<CarDealer> mod = (car) -> (car.getModel()== "Fortuner" && car.getColour() == "white");
		estream = cdlst.stream();
		estream.filter(mod).forEach((n) -> System.out.println("No. of cars in stock: "+n.getStock()));
		
		
		//2. group by model
		System.out.println("\n***** 2. group cars by models *****");
		estream = cdlst.stream();
		Map<String, List<CarDealer>> sub1 = estream.collect(Collectors.groupingBy(CarDealer::getModel));
		System.out.println(sub1);
		
		
		//3. count no of cars per model
		System.out.println("\n***** 3. sorting cars by model *****");
		estream = cdlst.stream();
		Comparator<CarDealer> bymodel = Comparator.comparing(CarDealer::getModel);
		estream.sorted(bymodel).forEach(System.out::println);
		
		
		//4. sort by price
		System.out.println("\n***** 4. Sort by price *****");
		estream = cdlst.stream(); 
		Comparator<CarDealer> byprice = Comparator.comparing(CarDealer::getPrice);
		estream.sorted(byprice).forEach((n) -> System.out.println(n.getModel()+ " " + n.getPrice()));
		
		
		//5. sort by year
		System.out.println("\n***** 5. Sort by year *****");
		estream = cdlst.stream(); 
		Comparator<CarDealer> byyear = Comparator.comparing(CarDealer::getYear);
		estream.sorted(byyear).forEach((n) -> System.out.println(n.getModel()+ " " + n.getYear()));

	}

}
