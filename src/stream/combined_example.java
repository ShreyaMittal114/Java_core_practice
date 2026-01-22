package stream;
import java.util.*;
import java.util.function.*;

public class combined_example {

	public static void main(String[] args) {
		Predicate<Integer>pre = x->x%2==0;
		Function<Integer,Integer> fun= x-> x*x;
		Consumer<Integer> con = x->System.out.println(x);
		Supplier<Integer> supplier =()->100;
		
		if(pre.test(supplier.get())) {
			con.accept(fun.apply(supplier.get()));
		}
		
	}

}
