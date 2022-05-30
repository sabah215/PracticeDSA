package com.dsabootcamp;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5, 8, 10, 20, 15, 40, 16, 9};
		int target = 10;
		
		System.out.println(linearSearch(arr, target));

	}
	
	static int linearSearch(int [] arr, int target) {
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
