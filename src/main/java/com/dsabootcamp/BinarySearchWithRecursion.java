package com.dsabootcamp;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = { 5,6,7,10, 12, 15 };
		int target = 13;    
		
		int ans = search(arr, target, 0, arr.length-1);
		
		System.out.println(ans);

	}
	
	public static int search(int [] nums, int target, int start, int end) {
		
		if(start > end)
			return -1;
		
		int mid = start + (end - start)/2;
		
		if (nums[mid] == target)
			return mid;
		
		else if (nums[mid] > target)
			return search(nums, target, start, mid-1);
	
			
		return search(nums, target, mid +1, end);
		
	}

}
