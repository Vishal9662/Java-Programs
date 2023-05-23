package array;

public class Jagged_Array {

	public static void main(String[] args) {

		int arr[][]=new int[5][];	// Jagged Array..
       
		arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];
        arr[3] = new int[3];
        arr[4] = new int[2];
        
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = count++;
			}
		}
		
		//--------------- Printing Jagged Array -------------------
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
