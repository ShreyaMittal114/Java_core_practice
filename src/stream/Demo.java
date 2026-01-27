package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//from collection
		System.out.println(numbers.stream().filter(x->x%2==0).count());
		
		//from array
		String arr[] = {"a","b","c"};
		System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
		
		//stream of
		System.out.println(Stream.of("ab","bc"));
		

	}

}
