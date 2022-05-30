package com.dsabootcamp;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 3 , 44, 23 , 9 , 18 , -32};
		
		System.out.print(Arrays.toString(bubble(arr)));

	}
	
	static int [] bubble(int [] arr) {
		
		for(int i = 0; i< arr.length; i++) {
			boolean swapped = false;
			
			for(int j= 1; j < arr.length - i; j++) {
				
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped)
				break;
		}
		return arr;
	}

}
