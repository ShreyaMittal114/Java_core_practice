package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class count_down_latch {

	public static void main(String[] args) throws InterruptedException {
		  int n = 3;
	        ExecutorService executorService = Executors.newFixedThreadPool(n);
	        CountDownLatch latch = new CountDownLatch(n);  // to wait for the completion of one or more than 1 thread
//	        executorService.submit(new DependentService(latch));
//	        executorService.submit(new DependentService(latch));
//	        executorService.submit(new DependentService(latch));
//	        latch.await();  //when countdown =0 , main thread will run
//	        System.out.println("Main");
//	        executorService.shutdown();
	        
	        
	        for(int i=0;i<n;i++) {
	        	
	        	new Thread(new  DependentService(latch)).start();
	        }
	        latch.await();
	        latch.await(5, TimeUnit.SECONDS);
	        System.out.println("main");
	        executorService.shutdown();
	        
	        
	        
	}

}
class DependentService implements Runnable {
    private final CountDownLatch latch;
    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public void run() {
        try {
        	 latch.countDown();
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(6000);
        }
        
        
        catch(Exception e) {
        	
        }
        
       
    }
}



//countdown latch - waiting for an event to happen not result, we want the threads to , dont return value, its not reusable
// future.get , invoke all - we care about the results, returns value

