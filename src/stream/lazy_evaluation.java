package stream;
import java.util.*;
import java.util.stream.*;

public class lazy_evaluation {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","shyam","aman","Ash","ash","ash");
		Stream<String> stream = list.stream().filter(name->{
				System.out.println("filtering "+ name);
				return name.length()>3;
		});
		
		System.out.println("before terminal op");
		List<String> res = stream.toList();
		System.out.println("after terminal op");
		System.out.println(res);
		
		

	}

}
