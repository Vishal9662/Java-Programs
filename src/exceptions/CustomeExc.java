package exceptions;

public class CustomeExc {

	public static void main(String[] args) throws OwnException {
		
		int age = 2;
		try {
			if(age<18) {
				throw new OwnException("You are now Child, Not Eligible for Vote");
				
			}
		}
		catch(OwnException e){
			System.out.println("Exception occured : "+e);
//			throw new OwnException("Custom Exception");	
			}
	}
}


class OwnException extends Exception{

	public OwnException(String msg) {
		super(msg);
//		System.out.println("Own Exception Constructor");
	}
}
