package oops;

public class Cmd_Arg {

	public static void main(String[] args) {
	
		// For Addition of 2 integers,
		
		int c=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
				
		System.out.println("Addition Of Integers : "+c+d);
		
		// If we don't do casting then it will do only concatenation instead of Addition,....+
		// Like this.......
		
		System.out.println("Concatenation Of Integers : "+args[2]+" "+args[3]);
		

		// If we want to print multiple Strings or Int from Command....
//		for(String o: args) {
//			System.out.print(o+" ");
//		}
	}
}
