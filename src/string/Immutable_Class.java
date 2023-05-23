package string;

public class Immutable_Class {

	public static void main(String[] args) {
		
		Exc_Immutable ob=new Exc_Immutable("BLA5065G");
		
		String s=ob.getpanNum();
		
		System.out.println("PAN Card Number is : "+s);

	}

}


final class Exc_Immutable{		// The class is final so we can not create sub class and not declare this things in sub class..

	final String panNum;	// This instance variable is final, so now we can not change or modify it..
	
	public Exc_Immutable(String panNum) {
		this.panNum = panNum;
		
	}
	
	// Here is only getter method is declared, not setter method, so there is not possible to change the value without setter method..
	public String getpanNum() {
		return panNum;
	}
	
}