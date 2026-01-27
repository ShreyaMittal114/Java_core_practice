package stream;

import java.util.Arrays;
import java.util.List;

public class examples {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","shyam","aman","Ash","ash","ash");
		List<Integer> numbers = Arrays.asList(1,2,3,3,4,4);
		
	   //print names with length>3
		
		System.out.println(list.stream().filter(x->x.length()>3).toList());
		
		//squaring and sorting no
		
		System.out.println(numbers.stream().map(x->x*x).sorted().toList());
		
		//counting occurence of a charcter
		String sen = "Hello World";
		
		System.out.println(sen.chars().filter(x->x=='l').count());

	}

}
