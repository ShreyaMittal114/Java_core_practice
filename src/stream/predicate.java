package stream;
import java.util.*;
import java.util.function.Function;
import java.util.function.*;

public class predicate {

	public static void main(String[] args) {
		  Math sum= (a,b)->a+b;
		  Math sub = (a,b)->a-b;
		  int res= sum.operate(1,2);
		  System.out.println(res);  
		  Predicate<Integer> isEven = x->x%2==0;
		  System.out.println(isEven.test(4));
		  
		  Function <Integer,Integer> TripleIt = x-> 3*x;
		  Function <Integer,Integer> doubleIt = x-> 2*x;
		  System.out.println(doubleIt.apply(5));
		  System.out.println(doubleIt.andThen(TripleIt).apply(6));
		  System.out.println(doubleIt.compose(TripleIt).apply(6));
		  
		  //consumer
		  List<Integer> list = Arrays.asList(1,2,3);
		  Consumer<List<Integer>> print= x->{
			  for(int i:x) {
				  System.out.println(i);
			  }
		  };
		  print.accept(list);
		  
		  
		  Supplier<String> Hello = ()->"Hello";
		  System.out.println(Hello.get());
		  
		  
		  
		  
		  
		  
		  

	}

}

@FunctionalInterface
interface Math{
	int operate(int a , int b);
}

