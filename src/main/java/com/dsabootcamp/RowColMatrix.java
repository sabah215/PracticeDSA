package com.dsabootcamp;

import java.util.Arrays;

public class RowColMatrix {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = { {10, 12, 23, 25, 30},
						 {11, 15, 24, 26, 32},
						 {14, 27, 30, 35, 37},
						 {20, 29, 33, 40, 47},
						 {39, 42, 44, 45, 50}
						} ;
		int target = 29;
		
		//int [] index = binarySearchIn2D(arr, target);
		
		
		System.out.print(Arrays.toString(binarySearchIn2D(arr, target)));
		
	}
	
	
	public static int [] binarySearchIn2D(int [][] arr, int target) {
		
		// int [] index = {-1, -1}; 
		
		int row = 0;
		int col = arr[0].length - 1;
		
		while(row < arr.length && col >= 0) {
			if(arr[row][col] == target) {
				
				return new int[] {row,col};
			}
			else if(arr[row][col] < target) {
				
				// reduce the search space by comparing the top most element
				// of the column
				row++;
			}	
			else if(arr[row][col] > target) {
				col--;
			}
		}
		
		return new int[] {-1, -1};
	}

}
