package com.dsabootcamp;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = { 5,6,7,10, 12, 15, 17, 19, 20,22,25, 27,30,36,38 };
		int target = 30;    
		
		int ans = binarySearch(arr, target);
		
		if (ans == -1) 
			{
			System.out.println("Value not found.");
			}
		else {
			System.out.println(ans);
			}
	
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

}
