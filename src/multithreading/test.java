package multithreading;

public class test {

	public static void main(String[] args) {
		//class
		World world = new World();   //New-thread state
		world.start();  // Runnable
		
		
		//interface
		World2 world2 = new World2();
		Thread t1 = new Thread(world2);
		t1.start();
		
		
		for(int i=0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}

class World extends Thread{
	@Override 
	public void run() {  //the code that will be executed
		for(int i=0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class World2 implements Runnable{
	@Override 
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

