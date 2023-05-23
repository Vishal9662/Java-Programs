package array;

import java.util.Scanner;

public class BiggestAndLowest {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the length of Array : ");

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		// For take the array element from user
		int arr[]=new int[n];
		System.out.println("\nEnter the Array Elements : ");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
		// For print the array element which is inserted by user 
		System.out.println("\nThe Elements are : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		// For find the smallest element in array
		int min=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
		}
		System.out.println("\n The Smallest Element in Array is : "+min);
		
		int max=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(max<arr[j]) {
				max=arr[j];
			}
		}
		System.out.println("\n The Biggest Element in Array is : "+max);

		sc.close();
	}

}
