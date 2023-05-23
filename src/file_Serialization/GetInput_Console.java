package file_Serialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetInput_Console {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name=sc.next();
		System.out.println("Welcome "+name+" By Scanner Class..");


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name: ");
		String nm=br.readLine();
		
		System.out.println("Welcome "+nm+" By BufferedReader Class..");
		sc.close();

	}
}
