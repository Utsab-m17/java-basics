 package basicPrograms;

import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while(i < j) {
			while(arr[i] <= pivot) i++;
			while(arr[j] > pivot) j--;
			
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[low];
		arr[low] = temp;
		return j;
	}
	
	public static void quickSort(int[] arr, int low, int high){
	    if (low < high)
	    {
	        int pivot = partition(arr, low, high);
	        quickSort(arr, low, pivot - 1);
	        quickSort(arr, pivot + 1, high);
	    }
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array length - ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements - ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr, 0, n-1);
		
		System.out.println("After quick sort - ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}	
	}
}
