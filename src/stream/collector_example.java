package stream;
import java.util.*;
import java.util.stream.Collectors;
public class collector_example {

	public static void main(String[] args) {
		  List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
		  System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));
		  
		  
		  //counting word occurence
		  
		  String sentence = "hello world hello java world";
		  System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
		  
		  //even and oddd partition
		  List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		  System.out.println(l2.stream().collect(Collectors.partitioningBy(x->x%2==0)));
		  
		  //summing values in a map
		  Map<String, Integer> items = new HashMap<>();
	        items.put("Apple", 10);
	        items.put("Banana", 20);
	        items.put("Orange", 15);
	        System.out.println(items.values().stream().reduce(Integer::sum));
	        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));
	        
	       // Creating a Map from Stream Elements
	        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
	        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
	        
	        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
	        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));;

		  
		  

	}

}
