package multithreading;

public class thread_communication {

	public static void main(String[] args) {
		/*inter thread communication method
		 * wait  // I am releasing the lock and going to sleep untill someone wakes me up 
		 * notify  // wakes up single thread that is waiting
		 * notifyAll  // wakes up all
		 * these methods can only be called in a synchronized block/method
		 */
		
	        SharedResource resource = new SharedResource();
	        Thread producerThread = new Thread(new Producer(resource));
	        Thread consumerThread = new Thread(new Consumer(resource));

	        producerThread.start();
	        consumerThread.start();

	}

}


class SharedResource {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();  // to restore its state
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();  // ek hi producer hai multiple consumer hai we can use notify All
    }

    public synchronized int consume() {
        while (!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}
class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}
