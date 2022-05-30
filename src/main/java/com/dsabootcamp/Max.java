package com.dsabootcamp;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 3 , 44, 23 , 9 , 18 };
		
		System.out.println(getMax(arr));
		
		System.out.println(getMaxInRange(arr, 4, 5));

	}
	
	static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i< arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		return max;
	}
	
	// Get max in range of values
	
	static int getMaxInRange(int[] arr, int start, int end) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i= start; i <= end; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		return max;
	}

}
