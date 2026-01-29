package multithreading;

import java.util.concurrent.locks.*;

public class Reentrant_eg {
//reentrant- deadlock prevention
	public static void main(String[] args) {
		Reentrant_eg example = new Reentrant_eg();
		 example.outerMethod();
		 

	}
	
	private final Lock lock = new ReentrantLock();  //can also add fairness true )
     
    public void outerMethod() {
    	//lock.lockInterruptibly();
        lock.lock();
        try {
            System.out.println("Outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();   //since the class is reentrant it will acquire it again
        try {             // each lock call must be paired with unlock call
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }

}
