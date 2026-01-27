package stream;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;
public class parallel_stream {

	public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();
	        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
	        List<Long> factorialsList = list.stream().map(parallel_stream::factorial).toList();
	        long endTime = System.currentTimeMillis();
	        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");
	        
	        
	        startTime = System.currentTimeMillis();
	        factorialsList = list.parallelStream().map(parallel_stream::factorial).toList();
//	        factorialsList = list.parallelStream().map(ParallelStream::factorial).sequential().toList();
	        endTime = System.currentTimeMillis();
	        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");

	        
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	        AtomicInteger sum =  new AtomicInteger(0);
	        List<Integer> cumulativeSum = numbers.stream().sequential().map(sum::addAndGet).toList();
	        System.out.println("Expected cumulative sum: [1, 3, 6, 10, 15]");
	        System.out.println("Actual result with parallel stream: " + cumulativeSum);
//	        int sum2=0;
//	        List<Integer> summ = numbers.stream().map(x->{
//	        		int i=x+sum2;
//	        		sum2=i;
//	        		return i;
//	        }).toList();

	}
	private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
