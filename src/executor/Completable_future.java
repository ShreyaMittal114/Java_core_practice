 package executor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Completable_future { //daemon thread (jvm wont wait for them)

	public static void main(String[] args) {
		CompletableFuture<String> cf=	CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(1000);
				System.out.println("worker");
			}
			catch(Exception e) {
				
			}
			return "ok";
		});
		
		CompletableFuture<String> cf2=	CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(3000);
				System.out.println("worker");
			}
			catch(Exception e) {
				
			}
			return "ok";
		}).thenApply(x->x+x);
		
		//main wont wait for completable future
//		System.out.println("main");
		
//		String s = null;
//		try {
//			s=cf.get();
//		}
//		catch(Exception e) {
//			
//		}
//		System.out.println("main"); //now main will wait
		
		
//		String a = null;
//		a= cf.getNow("noo"); 
//		System.out.println(a);
//		System.out.println("main");
//		
		CompletableFuture<Void> f =	CompletableFuture.allOf(cf,cf2);  //void because keeps a track ki future complete hue hai ya ni
		//f.get()
		//f1.get(), f2.get() - to get individually
		f.join();
		try {
			System.out.println(cf2.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main");
		
		
		
		

	}

}
