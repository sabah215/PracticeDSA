package com.dsabootcamp;

import java.util.Arrays;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] x = {-4,-1,0,3,10};
//		System.out.println(Arrays.toString(sortedSquare(x)));
		
		for (int c: sortedSquare(x)) {
			System.out.println(c);
		}

	}
	
	public static int [] sortedSquare(int [] nums) {
		
		int n = nums.length;
		
		int [] res = new int[n];
		
		int i=0, j=n-1;
		
		for(int p = n-1; p>0; p--) {
		
			if(Math.abs(nums[i]) > Math.abs(nums[j])) {
				res[p] = nums[i] * nums[i];
				i++;
				
			}
			
			else{
				res[p] = nums[j] * nums[j];
				j--;
				
			}
			
			
			
				
					
		}
		return res;
	}
		
	

	
	

}
