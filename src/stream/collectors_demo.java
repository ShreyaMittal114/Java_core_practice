package stream;

import java.util.*;
import java.util.stream.Collectors;

public class collectors_demo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,3,4,4);
		Set<Integer> set = numbers.stream().collect(Collectors.toSet());
		System.out.println(set);

		
		List<String> names = Arrays.asList("Ram","shyam","aman","Ash","ash","ash");
		ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
		  System.out.println(collect);
		  
		  
		  //joining strings
		  String s = names.stream().map(String:: toUpperCase).collect(Collectors.joining(" "));
		  System.out.println(s);
		  
		  //summarizing data
		   IntSummaryStatistics stats =numbers.stream().collect(Collectors.summarizingInt(x->x));
		   System.out.println("Count: " + stats.getCount());
	        System.out.println("Sum: " + stats.getSum());
	        System.out.println("Min: " + stats.getMin());
	        System.out.println("Average: " + stats.getAverage());
	        System.out.println("Max: " + stats.getMax());
	        
	        
	        
	        // 6. Calculating Averages
	        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
	        System.out.println("Average: " + average);
	        
	        
	        //grouping elements
	        
	        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
	        System.out.println( words.stream().collect(Collectors.groupingBy(String::length)));
	        System.out.println( words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(","))));
	        System.out.println( words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new,Collectors.counting())));
	        
	        //partition
	        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
	        
	        //mapping and collecting
	        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
		   
	}

}
