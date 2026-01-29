package multithreading;

public class Thread_Methods extends Thread {
	
	public Thread_Methods(String name) {
		super(name);               // naming thread through parent constructor
	}
	@Override
	public void run() {
//		System.out.println("Thread is running");
////		for(int i=0;i<=5;i++) {
////			try {
////				Thread.sleep(1000);
////			}
////			catch(	Exception e) {
////				System.out.println(e.getMessage());
////			}
////			System.out.println(i);
////		}
//		for(int i=0;i<=5;i++) {
//		System.out.println(Thread.currentThread().getName() +  " priority " + Thread.currentThread().getPriority() + "count:" + i);
//		try {
//			Thread.sleep(1000);
//		}
//		catch(	Exception e) {
//			System.out.println(e.getMessage());
//		}
//		}	
		
//		try {
//		Thread.sleep(1000);
//		System.out.println("running");
//	}
//	catch(	Exception e) {
//		System.out.println(e+ "Thread interrupted");
//	}
		
//		for( int i=0;i<5;i++) {
//			System.out.println(Thread.currentThread().getName()+ " is running");
//			Thread.yield();  //dusre thread ko bhi chance do(just a hint)
//		}
		
		while(true) {
			System.out.println("Hello");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
//		 Thread_Methods t1 = new  Thread_Methods("low");
//		 Thread_Methods t2 = new  Thread_Methods("med");
//		 Thread_Methods t3 = new  Thread_Methods("high");
//		
//		 System.out.println("hello");
//		 t1.setPriority(Thread.MIN_PRIORITY);
//		 t2.setPriority(Thread.NORM_PRIORITY);
//		 t3.setPriority(Thread.MAX_PRIORITY);
//		 t1.start();
//		// t1.join();
//	     t2.start();
//		 t3.start();
		 //yield
//		 Thread_Methods t1 = new  Thread_Methods("t1");
//		 Thread_Methods t2 = new  Thread_Methods("t2");
//		 t1.start();
//		 t2.start();
		// t1.interrupt();Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException
		 
		 //daemon
		 Thread_Methods my = new  Thread_Methods("daemon");
		 my.setDaemon(true);
		 my.start();
		 System.out.println("Main done");

	}

}

// user thread - jinse hm kaam kara re hai kuch 
//daemon threads - background mai chlate hai (eg garbage collector) (JVM doesnt wait for them)
/* start
  run 
sleep
join 
set priority  , interrupt , yield , setDaemon
*/