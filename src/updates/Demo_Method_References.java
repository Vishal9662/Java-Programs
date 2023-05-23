package updates;

public class Demo_Method_References {

	public static void main(String[] args) {

		Aa a = Help::help;
		a.m1();

		Help ob = new Help();
		Aa b = ob::ns;
		b.m1();

		// Here if we want to implement method references with in multi-threading..
		Runnable runnable = Help::task;
		Thread t = new Thread(runnable);
		t.start();

	}
}

class Help {
	static void help() {
		System.out.println("I'm static method From Help Class..");
	}

	void ns() {
		System.out.println("I'm non-static Method from Helper Class..");
	}

	// for imlement with threading..
	static void task() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

interface Aa {
	void m1();
}

/*
 * Help class ma j method hti eni body Aa interface ne aapvi ti atle bdhu
 * farithi lkhva krta better che k ena mate Method references(::) no use krie..
 * Method references method refer kre che.. Method static hoy to direct class
 * thi thy jse ny to eno object through refer krvi..
 * 
 * Syntax:-> ClassName :: methodName
 * 
 */