package updates;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_ExecutorService {

	public static void main(String[] args) {
		
		ExecutorService exs=Executors.newSingleThreadExecutor();
		
		exs.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("First Method is running...");
			}
		});
		
		exs.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Second method is running...");
			}
		});

		exs.shutdown();
	}
}
