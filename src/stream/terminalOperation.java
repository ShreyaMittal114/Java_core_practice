package stream;

import java.util.*;
import java.util.stream.*;

public class terminalOperation {

	public static void main(String[] args) {
		 //collect
		//toList
		List<String> list = Arrays.asList("Ram","shyam","aman","Ash","ash","ash");
		System.out.println(list.stream().toList());
		
		//for each
		list.stream().forEach(x->System.out.println(x));
		
		//reduce
		List<Integer> numbers = Arrays.asList(1,2,3,3,4,4);
		System.out.println(numbers.stream().reduce((x,y)->x+y).get());
		
		//anyMatch, allMatch , noneMatch
		
		boolean b = numbers.stream().allMatch(x->x>2);
		boolean b2 = numbers.stream().anyMatch(x->x>2);
		boolean b3 = numbers.stream().noneMatch(x->x>7);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		
		
		//find first , find any
		System.out.println(list.stream().findAny().get());
		System.out.println(list.stream().findFirst().get());
		
		
		Object[] array = Stream.of(1, 2, 3).toArray();

        //min/max
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o1 - o2).get());
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()));
        
        
        Stream <String> stream = list.stream();
        stream.forEach(x->System.out.println(x));
        //System.out.println(stream.map(String::toUpperCase).toList());  // exception stream already used cannot be reused
        
        
        //forEachOrdered
        System.out.println("Here");
        numbers.parallelStream().forEachOrdered(System.out::println);
        
        
		


		
		
		
		

	}

}
