package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exception {

	public static void main(String[] args) {


		try {
			FileInputStream file=new FileInputStream("vishal.txt");//If we don't give correct path of file then it will throw exception and give our custom message
			System.out.println("We got your file");
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Your file is not found, Please give correct path of your file");
		}
	}

}