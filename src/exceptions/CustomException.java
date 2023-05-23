package exceptions;

public class CustomException {
	public static void main(String[] args) throws MyException{
		
		int i=5;
		try {
				if(i<10) {
					throw new MyException("Here is went Something wrong..");
				}
		}
		catch(MyException e) {
			System.out.println("Exception ocuured : "+e);
			throw new MyException("Exception ocuured : "+e);
		}	
	}
}


class MyException extends Exception{

	public MyException(String msg) {
		super(msg);
		System.out.println("This is User Defined Exceptions Constructor");

	}
}