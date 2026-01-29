package multithreading;

public class thread_lifecycle extends Thread {
	@Override
	public void run() {
		System.out.println("running");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		thread_lifecycle t1 = new thread_lifecycle();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
	//	System.out.println(Thread.currentThread().getState() );
	//	System.out.println(Thread.currentThread().getName());
		
		Thread.sleep(300);
		System.out.println("main one"+Thread.currentThread().getState() );
		System.out.println(t1.getState());
		t1.join();  // main method will wait for t1 to get finished
		System.out.println(t1.getState()  );
		

	}

}
