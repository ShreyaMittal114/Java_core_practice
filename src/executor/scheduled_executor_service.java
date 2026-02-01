package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class scheduled_executor_service {

	public static void main(String[] args) {
		ScheduledExecutorService ex= 	Executors.newScheduledThreadPool(1);
          ex.scheduleAtFixedRate(()->    //5 sec ke baad hi dusra kaam hoga even if first abhi bhi chl raha
             System.out.println("5sec delay"), 5,5,TimeUnit.SECONDS
          );
         ex.schedule(()->{
           System.out.println("initiating shutrdown");
           ex.shutdown();
         },20,TimeUnit.SECONDS);
         
         //how long should i wait after the first task gets completed to start the next task
         ex.scheduleWithFixedDelay(()->    
         System.out.println("5sec delay"), 5,5,TimeUnit.SECONDS
      );
         
         
         
         
         //short lived task and variable load
         ExecutorService ex2  = Executors.newCachedThreadPool();
	}

}
