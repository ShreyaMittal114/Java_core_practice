package multithreading;

public class synchronization {

	public static void main(String[] args) {
		Counter c = new Counter();
		 mythread t1 = new  mythread(c);
		 mythread t2 = new  mythread(c);
		 t1.start();
		 t2.start();
		 try {
			 t1.join();
			 t2.join();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 
		 System.out.println(c.getCount());  // we wont get the desired value;
	}                                       // use synchronized for desired ans(to avoid race condition)

}

class Counter{
	private int count=0;
	
	public  synchronized void increment() {  // critical section
		                                     //mutual exclusion - only one thread at a time can access shared resource
//		//synchronized(this){
//		count++;
//	}  // khali ek method ko synchronize karna hai
		count++;
	}
	public int getCount() {
		return count;
	}
}


class mythread extends Thread{
	private Counter counter;
	public mythread(Counter counter) {
		this.counter= counter;
	}
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			counter.increment();
		}
	}
	
}
