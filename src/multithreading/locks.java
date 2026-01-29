package multithreading;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class locks {  // lock is an interface

	public static void main(String[] args) {
		// intrinsic lock - built into every object in java , when we use synchronized keyword we use these locks
		// explicit lock - control urself, using lock class;
		bank b = new bank();
		Runnable task = new Runnable() {   // anonymus class
			@Override                       // java made a class in background that implements runnable and made the object of that class
			public void run() {
				b.withdraw(60);
			}
		};
		Thread t1 = new Thread(task, "T1");
		Thread t2 = new Thread(task ,"T2");
		t1.start();
		t2.start();
		
		

	}

}


class bank{
	private int balance = 100;
	
	private final Lock lock = new ReentrantLock();  // implementation of lock class
	
	
	public  void withdraw(int amount) {
	System.out.println(Thread.currentThread().getName()+ " attempting to withdraw" + amount);
	
	try {
		if(lock.tryLock(1000,TimeUnit.MILLISECONDS)) { //aquires the lock within given waiting time otherwise leave
			if(balance>= amount) {
				System.out.println(Thread.currentThread().getName()+" procedding with withdrawal");
				
				try {
						Thread.sleep(3000);
						balance-= amount;
						System.out.println("success");

				}
				catch(Exception e) {
					Thread.currentThread().interrupt();
				}
				finally {
					lock.unlock();
				}
				
				
			}
			else {
				System.out.println(Thread.currentThread().getName()+" : Insufficient balance");
			}
		}
		else {
			System.out.println(Thread.currentThread().getName()+ " could not acquire thelock will try again later");
		}
	}catch(Exception e) { 
		Thread.currentThread().interrupt();  // thread ki state ko restore kia hai for further use
	}
	
	if(Thread.currentThread().isInterrupted()) {
		System.out.println("hi");
	}
	
	//lock.lock() - same as synchronized
	//public  synchronized void withdraw(int amount) {
//	if(lock.tryLock()) {  // wait ni karega
//		
//	}
//		if(balance>= amount) {
//			System.out.println(Thread.currentThread().getName()+" procedding with withdrawal");
//			
//			try {
//					Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//			balance -= amount;
//			System.out.println("success");
//		}
//		else {
//			System.out.println(Thread.currentThread().getName()+" : Insufficient balance");
//		}
//	}
	}
}
