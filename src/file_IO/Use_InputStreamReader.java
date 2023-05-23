package file_IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Use_InputStreamReader {
	public static void main(String[] args) throws Exception {
		InputStreamReader inr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(inr);
		
		System.out.println("Enter your name: ");
		
		String name=br.readLine();
		
		System.out.println("Welcome "+name);
		
		
		//---------------------------------
//		String name="";
//		while(!name.equals("no")) {
//			System.out.println("Enter name: ");
//			
//			String s=br.readLine();
//			System.out.println("Welcome "+s);
//		}
		
		br.close();
		inr.close();
	}
}