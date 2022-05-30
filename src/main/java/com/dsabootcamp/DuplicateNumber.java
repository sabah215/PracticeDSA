package com.dsabootcamp;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int duplicateNumber(int [] nums) {
		
		int i = 0;
		
		while(i < nums.length) {
			 
			if(nums[i] != i + 1) {
				int correct = nums[i] - 1;
				
				if(nums[i] != nums[correct]) {
					swap(nums, i, correct);
				}
				
				else {
					return nums[i];
				}
				
			}
			else {
				i++;
				}
			
			
		}
		return -1;
		
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
