package com.dsabootcamp;

public class CeilingAndFloor {
	
	// Time Complexity O(log n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = { 2, 5, 6, 8, 9, 11, 14, 16, 21} ;
		
		int target = 1;
		
		int ceiling = getCeiling(arr, target);
		int floor = getFloor(arr, target);
		
		System.out.println(ceiling);
		System.out.println(floor);
		
	}
	
	static int getCeiling(int [] arr, int target) {
		
		// target number is greater than all the 		
		// numbers in the array, no ceiling exists
		
		if(target > arr[arr.length - 1]) {
			return -1;
		}
		
		int s = 0;
		
		int e = arr.length - 1;
	
		
		while(s <= e) {
			
			int m = s + (e - s) / 2;
			
			if (arr[m] == target)
				return m;
			
			else if(arr[m] < target) 
				s = m + 1;
			
			else 
				e = m - 1;
			
		}
		return s;
	}
	
	static int getFloor(int [] arr, int target) {
		
		int s = 0;
		
		int e = arr.length - 1;
	
		
		while(s <= e) {
			
			int m = s + (e - s) / 2;
			
			if (arr[m] == target)
				return m;
			
			else if(arr[m] < target) 
				s = m + 1;
			
			else 
				e = m - 1;
			
		}
		
		return e;
	}
}
