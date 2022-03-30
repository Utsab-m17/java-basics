package basicPrograms;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements of the array - ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp=0;
		
		System.out.println("Enter the elements to the array - ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("BEFORE SORTING ->");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("AFTER SORTING ->");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
