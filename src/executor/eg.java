package executor;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class eg {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService  eg = Executors.newFixedThreadPool(2);
//		Future<Integer>  a = eg.submit(()->1+2);
//		Integer i = a.get();
//		System.out.println("sum : " + i);
//		//eg.shutdown();
//		System.out.println(eg.isShutdown());
//		Thread.sleep(1); // give time to terminate
//		System.out.println(eg.isTerminated());
		
		Callable<Integer> c1 = ()->{
		    System.out.println("task 1");
		    return 1;
		};
		Callable<Integer> c2 = ()->{
			System.out.println("task 2");
		    return 2;
		};
		Callable<Integer> c3 = ()->{
			System.out.println("task 3");
		    return 3;
		};
		
		List<Callable<Integer>> l = Arrays.asList(c1,c2,c3);
//		eg.invokeAll(l);
//		List<Future<Integer>> list = eg.invokeAll(l);  //blocks untill all task are complete
		//List<Future<Integer>> list = eg.invokeAll(l,1,TimeUnit.seconds); agar koi task rahe gaye to wo cancel ho jaenge
		Integer b = eg.invokeAny(l); 
		System.out.println(b);// jo pehle complete hoga unhe return kardega baki ko cancel
//		for(Future<Integer> f : list) {
//			System.out.println(f.get());
//		}
		System.out.println("Heloo world");
		eg.shutdown();
		
		
		
		
		
	

	}

}
