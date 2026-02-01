package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class demo {

	public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();
//manually		 
//		 Thread[] thread = new Thread[9];
//		 for(int i=1;i<10;i++) {
//			 int finalI=i;
//			 thread[i-1]=new Thread(()->{
//				 long result = factorial(finalI);
//	                System.out.println(result);
//			 }
//				 
//			 );
//			 thread[i-1].start();
//		 }
//		 
//		 for(Thread th:thread) {
//			 try {
//				 th.join();
//			 }
//			 catch(Exception e) {
//				 Thread.currentThread().interrupt();
//			 }
//		 }
		 
	        ExecutorService executor = Executors.newFixedThreadPool(3);
	        for (int i = 1; i < 10; i++) {
	            int finalI = i;
	            executor.submit(() -> {
	                long result = factorial(finalI);
	                System.out.println(result);
	            });

	        }
	        executor.shutdown();  
	        // iske baad dusre task ko submit ni kar sakte
	        try {
	            executor.awaitTermination(1000, TimeUnit.SECONDS); //blocks untill all task are completed after a shutdown request or the current thread is interrupted
	        } catch (InterruptedException e) {
	            throw new RuntimeException(e);
	        }

	      System.out.println("Total time " + (System.currentTimeMillis() - startTime));

	}
	
	
	
	
	
	
	private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
