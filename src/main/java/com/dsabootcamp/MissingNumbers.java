package com.dsabootcamp;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			int [] arr = {9,6,4,2,3,5,7,0,1};
			
			
			System.out.print(Arrays.toString(arr));
			System.out.println();
			
			int missed = cyclicSort(arr);
			
			
			System.out.print(missed);



}
static int cyclicSort(int [] arr) {
		
		int i = 0;
		
		while(i < arr.length) {
			
			int correct = arr[i];
			
			if(arr[i] < arr.length && arr[i] != arr[correct]){
			
					swap(arr,i,correct);
				}
			
			else {
				i++;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			if (arr[j] != j) {
				return j;
			}
		}
		
		 return arr.length;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
