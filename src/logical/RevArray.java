package logical;

public class RevArray {

	public static void main(String[] args) {
		int  arr[]= {1,5,8,63,41,32,78};
		int i=0, j=arr.length-1;
		int temp=0;

		int ka=5;
		
		while(i < j) {
			
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
			
			
		}
		
		System.out.println("Reversing Array...");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+", ");
		}
		
		
	//----------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("\nReverse with cutomization...");
		for(int r=0;r<ka;r++) {
			
			int tmp=arr[arr.length-1];
			
			for(int q=arr.length-1;q>0;q--) {
				arr[q]=arr[q-1];
			}
			
			arr[0]=tmp;
			
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+", ");
		}
		
	}
}
