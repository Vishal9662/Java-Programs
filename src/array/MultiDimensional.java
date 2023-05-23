package array;

public class MultiDimensional {

	public static void main(String[] args) {

		
		int arr[][]= {{1,5,7,4,3},{7,5,6,3,4},{6,8,7,2,1}};
		
		System.out.println("This is your MultiDimensional Arrays Element : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
