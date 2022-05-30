package com.dsabootcamp;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {7,3,4,2,5,1,6};
		
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		int [] sorted = cyclicSort(arr);
		
		
		System.out.print(Arrays.toString(sorted));

	}
	
	static int [] cyclicSort(int [] arr) {
		
		int i=0;
		
		while(i < arr.length) {
			
			int index = arr[i] -1;
			
			if(arr[i] != arr[index]){
				swap(arr,i,index);
				
			}
			i++;
		}
		
		 return arr;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
