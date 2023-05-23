package threading;

//Ex for performing multiple task by implementing Runnable Interface..

public class ThreadEx_Lambda {

	public static void main(String[] args) {
		
		//Using By Anonymous Class...
		Runnable obj=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("A:-> "+i);
					try{Thread.sleep(500);}catch(Exception e) {}
					
				}
			}
		};
		
		Runnable obj1=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("B:-> "+i);
					try{Thread.sleep(500);}catch(Exception e) {}

				}
			}
		};
		
		
		//Using Lambda Expression or Functional Interface..
//		Runnable obj = () ->{
//			for(int i=1;i<=5;i++) {
//				System.out.println("Thread :-> "+i);
//			}
//		};
//		
//		Runnable obj1 = () ->{
//			for(int i=1;i<=5;i++) {
//				System.out.println("Thread :-> "+i);
//			}
//		};
		
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();
		
	}

}
