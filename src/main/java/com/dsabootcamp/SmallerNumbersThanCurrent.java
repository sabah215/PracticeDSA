package com.dsabootcamp;

public class SmallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {8,1,2,2,3};
		
		int [] arr = smallerNumbersThanCurrent(nums);
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}

	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
	        int[] freq = new int[101];
	        int[] smaller = new int[101];
	        for(int num : nums) {
	            freq[num] ++;
	        }
	        int runner = 0;
	        for(int i = 0; i <= 100; i ++) {
	            smaller[i] = runner;
	            runner += freq[i];
	        }
	        for(int i = 0; i < nums.length; i ++) {
	            nums[i] = smaller[nums[i]];
	        }
	        return nums;
	    }

}
