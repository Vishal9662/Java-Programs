package java_Concurrency;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) throws IOException {
		System.out.println("Start..");
		ServerSocket socket=new ServerSocket(0);
		System.out.println("Running");
		for(int i=1;i<=1;i++) {
			
			Socket s=socket.accept();
			boolean res;
	        if (s.isClosed())
	            throw new SocketException("Socket is closed");
	        if (res=!s.isBound())
	            throw new SocketException("Socket is not bound yet");
			
			System.out.println("Running in for loop");
			
			Runnable r= new Runnable() {
				
				@Override
				public void run() {
					int a=5/0;
					
					System.out.println("Hii"+s);
				}
			};
			
			new Thread(r).start();
		}
		socket.close();
		System.out.println("End..");
	}
}
