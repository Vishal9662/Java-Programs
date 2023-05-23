package logical;

public class Armstrong_Num {

	public static void main(String[] args) {
		int n=1634;
		int sum=0, rem=0, temp;
		
		temp=n;
		
		for(int i=n;i>=0;i++) 
		{
			if(n>0) {
				rem=n%10;
				n=n/10;
				sum=sum+(rem*rem*rem*rem);
			}
		}
		
		if(temp==sum) {
			System.out.println(temp+" is armstrong number");
		}
		else {
			System.out.println(temp+" is not armstrong number");
		}
	}
}
