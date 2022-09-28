package com.dsabootcamp;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,0,3,5,9,12 };
		int target = 9;
		
		int ans = search(arr, target);
		
//		if (ans == -1)
//			{
//			System.out.println("Value not found.");
//			}
//		else {
//			System.out.println(ans);
//			}
		System.out.println(ans);

	}
	
	static int binarySearch(int [] arr, int target) {
		
		int start = 0 ; 
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid  = start + (end - start)/2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			
			else {
				return mid;
			}
		}
		
		 return -1;
	}

	static int search(int[] nums, int target) {

		int s = 0, e = nums.length - 1;

		while(s <= e){

			int m = s + (e - s) / 2;

			if (nums[m] == target)
				return m;

			if (nums[m] < target)
				s = m + 1;

			else e = m - 1;
		}

		return -1;
	}

}
