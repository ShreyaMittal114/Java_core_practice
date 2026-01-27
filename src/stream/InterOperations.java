package stream;
import java.util.*;
import java.util.stream.*;

public class InterOperations {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","shyam","aman","Ash","ash","ash");
		
		// filter
		long res= list.stream().filter(x->x.startsWith("A")).count();   // case sensitive hai
		System.out.println(res);
		
		
		// map --- function
		Stream<String> st = list.stream().map(x->x.toUpperCase());
		Stream<String> st2 = list.stream().map(String ::toUpperCase);
		// sort
		Stream<String> st3 = list.stream().sorted();
		Stream<String> st4 = list.stream().sorted((a,b)->a.length()-b.length());
		
		// distinct
		System.out.println(list.stream().filter(x->x.startsWith("a")).distinct().collect(Collectors.toList()));
		System.out.println(list.stream().filter(x->x.startsWith("a")).count());
		
		//limit
		System.out.println(Stream.iterate(1, x->x+1).limit(100).collect(Collectors.toList()));
		
		//skip
		System.out.println(Stream.iterate(1, x->x+1).skip(10).limit(100).collect(Collectors.toList()));
		
		//peek
		Stream.iterate(1,x->x+1).skip(10).limit(100).peek(x->System.out.println(x)).count();
		//flatMap
		
		
		List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
		
        List<String> sen = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        
        System.out.println(sen.stream().
        		flatMap(x->(Arrays.stream(x.split(" ")))).
        		map(String :: toUpperCase).toList());

	}

}
