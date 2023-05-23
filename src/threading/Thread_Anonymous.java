package threading;

public class Thread_Anonymous {

	public static void main(String[] args) {
		
		// perform multiple task by Thread Anonymous Class
		Thread t=new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i+" -> First Run Method By extending Thread Class..");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i+" -> Second Run Method By extending Thread Class..");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		t.start();
		t1.start();
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		//performing multiple task by Implementing Runnable Interface By Anonymous Class... 
		Runnable tr=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i+" ==> 1st Run Method By Runnable Interface...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
			}
		};
		
		Thread tr1=new Thread(tr);
		tr1.start();
		
		
		Runnable trr=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i+" ==> 2nd Run Method By Implementing Runnable Interface...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread trr1=new Thread(trr);
		trr1.start();
		
	}

}
