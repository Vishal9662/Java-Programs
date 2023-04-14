package serialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console_IO {
	public static void main(String[] args) throws IOException {
		
		//read input by BufferedReader Class
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name:- ");
		String name=br.readLine();
		System.out.println("Hyy, "+name+" By BufferedReader Class");
		
		//read input by Scanner Class
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter your name: ");
		String nm=sc.next();
		System.out.println("Hyy "+nm+" By Scanner Class");
		
		sc.close();
		
	}

}
