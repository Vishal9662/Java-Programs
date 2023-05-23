package threading;
//Ex for performing multiple task by multiple thread..
public class ThreadEx extends Thread {

	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("ThreadEx :->  "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();
		A t2=new A();
	
		t1.start();
		t2.start();

	}
}

class A extends Thread
{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("A:-> "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}