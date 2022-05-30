package com.dsabootcamp;

import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,4,-1,1};
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		int positive = findFirstMissingPositive(arr);
		
		System.out.print(positive);

	}
	
	static int findFirstMissingPositive(int [] nums) {
		
		int i = 0;
		
		while(i < nums.length) {
			 
			
			int correct = nums[i] - 1;
			
			if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
				swap(nums, i, correct);
			}
			
			else {
				i++;
			}
		
	
		}	
		
		for(int j=0; j < nums.length; j++) {
			
		
			if(nums[j] != j+1)
				return j+1;
			
		}
		
		return nums.length+1;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
