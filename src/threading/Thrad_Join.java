package threading;

public class Thrad_Join extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
				System.out.println("THread Name : "+Thread.currentThread().getName());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thrad_Join t=new Thrad_Join();
		Thrad_Join t1=new Thrad_Join();
		Thrad_Join t2=new Thrad_Join();

		t.start();
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
		try {
			t.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t1.start();
		t2.start();
		
//		System.out.println("THread Name : "+Thread.currentThread().getName());
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}
}

//Pela 1st thread over thse kem k join() use kri che atle and 1st thread over thse psi j 2nd thread start thse...
