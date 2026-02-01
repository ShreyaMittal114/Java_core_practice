package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Future_eg {

	public static void main(String[] args) {
		ExecutorService eg = Executors.newSingleThreadExecutor();
		Future<?> future = eg.submit(()->System.out.println("Hello")); 
		Future<?> future2 = eg.submit(()->System.out.println("Hello"), "success");  //  return the result(success) upon successfull completion
		//?-can be anything int, etc
//		try{
//			System.out.println(future.get());  // waits if necessary for the execution to complete
//		}
//		catch(Exception e) {
//			Thread.currentThread().interrupt();
//		}
//		if(future.isDone()) {
//			System.out.println("Task completed");
//		}
//		
		
		Integer i = null;
		Future<Integer> fut = eg.submit(()->{
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				Thread.currentThread().interrupt();
			}
			return 42;
			
		});
		
		try {
			i=fut.get(1, TimeUnit.SECONDS);
			System.out.println(fut.isDone());
			System.out.println(i);
		}
		catch(Exception e) {
			Thread.currentThread().interrupt();
			System.out.println("exception");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fut.cancel(false);
		System.out.println(fut.isCancelled());
		eg.shutdown();
		

	}

}
//kuch return karana hai use callable , call method, signature has throws
// nhi karana-runnable, run method, use try catch only