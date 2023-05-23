package array;

public class Addition_Of_TwoArray {

	public static void main(String[] args) {

		int a[][]= {{3,4,3},{3,5,5}};
		int b[][]= {{5,3,3},{6,4,5}};
		int c[][]= new int[2][3];
		
		for(int i=0;i<2;i++){  
			
			for(int j=0;j<3;j++){  
				c[i][j]=a[i][j] + b[i][j];		// Use "*" for Multiplication......  
				System.out.print(c[i][j]+" ");   
			}  
			
		System.out.println();  
		}		
		
		
	}

}
