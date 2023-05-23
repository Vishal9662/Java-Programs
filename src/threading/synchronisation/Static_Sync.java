package threading.synchronisation;

public class Static_Sync {
	public static void main(String[] args) {
		Bank obj=new Bank(50000);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		
		
		Bank obj1=new Bank(50000);
		Thread t3=new Thread(obj1);
		Thread t4=new Thread(obj1);
		
		t3.setName("3rd Thread");
		t4.setName("4th Thread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


class Bank extends Thread{
	static int bal=50000;
	static int withdraw;
	
	public Bank(int withdraw) {
		this.withdraw=withdraw;
	}
	
	public static synchronized void withdraw() {
		String name=Thread.currentThread().getName();
		if(withdraw<=bal) {
			System.out.println(name+" withdrawn money..");
			bal=bal-withdraw;
		}
		else {
			System.out.println("Not Enough Balance...");
		}
	}
	
	public void run() {
		withdraw();
	}

	
}