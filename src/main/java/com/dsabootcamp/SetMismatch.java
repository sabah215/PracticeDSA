package com.dsabootcamp;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int [] arr = {1,1};
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		int [] mismatch = findSetMismatch(arr);
		
		System.out.print(Arrays.toString(mismatch));

	}
	
	static int [] findSetMismatch(int [] nums) {
		
		int i = 0;
		
		while(i < nums.length) {
			 
			int correct = nums[i] - 1;
				
				if(nums[i] != nums[correct]) {
					swap(nums, i, correct);
				}
				
				else {
					i++;
				}
			}
		
		for(int j=0; j < nums.length;j++) {
			
			if(nums[j] != j+1) {
				
				return new int[] {nums[j], j+1}; 
			}
		}
		
		return new int[] {-1, -1};
		
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
