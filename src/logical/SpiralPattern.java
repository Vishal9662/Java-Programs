package logical;

public class SpiralPattern {

	public static void main(String[] args) {

		int n=5;
		int arr[][] = new int[n][n];
		int startRow=0, endRow=n-1;
		int startCol=0, endCol=n-1;
		int count=1;
		
	

			for(int i=startRow; i<=endRow; i++) {
				arr[startRow][i]=count;
				count++;
			}

			for(int i=startRow+1;i<endRow;i++) {
				arr[i][endRow]=count;
				count++;
			}
			
			for(int i=endCol;i>startCol-1;i--) {
				arr[endRow][i]=count;
				count++;
			}
			
			for(int i=endRow-1;i>startRow;i--) {
				arr[i][startCol]=count;
				count++;
			}
			
		
		
		//for printing the all data which is stored in our 2d array..
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(j==0 || i==0 || j==n-1 || i==n-1) {
				
				System.out.print(arr[i][j]+"  ");
			}
			else {
				System.out.print("   ");
			}
			}
			System.out.println();
		}

	}
}



/*
				int n=4;
		int a=1;
		int arr[][]=new int[n][n];
		int row=0, col=n-1;
		
		
		for(int i=1;i<=n/2;i++) {
			
			for(int j=row;j<=col;j++) {
				arr[row][j]=a;
				a++;
			}
			
			for(int j=row+1;j<=col;j++) {
				arr[j][col]=a;
				a++;
			}
			
			for(int j=col-1;j>=row;j--) {
				arr[col][j]=a;
				a++;
			}
			
			for(int j=col-1;j>=row+1;j--) {
				arr[j][row]=a;
				a++;
			}
			
			row++;
			col--;
		}
 
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(arr[row][col]);
		
		---------------------------------------------------------------------------------------------------------------------------------------------------
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==1 || i==n) {
					System.out.print(a+" ");
					a++;
				}  
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}		
*/