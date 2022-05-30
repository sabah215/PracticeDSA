package com.dsabootcamp;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,1,1,1,1};
		
		for(int i=0;i < arr.length;i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		
		int [] sorted = insertion(arr);
		
		
		for(int i=0;i < sorted.length;i++)
			System.out.print(sorted[i] + ", ");

	}
	
	static int [] insertion(int [] arr) {
		
		for (int i=0; i < arr.length - 1; i++) {
			for (int j= i+1; j > 0; j--) {
				
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
		
		return arr;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
