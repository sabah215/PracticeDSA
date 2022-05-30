package com.dsabootcamp;

import java.util.ArrayList;

//1389. Create Target Array in the Given Order


public class CreateTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}
	

	public static int[] createTargetArray(int[] nums, int[] index) {
        
		ArrayList arrList = new ArrayList();
		
		int arr [] = new int[nums.length];
		
		for (int i=0; i< nums.length; i++) {
			arrList.add(index[i],nums[i]);
		}
		
		for (int j=0;j< arr.length; j++) {
			arr[j] = (int) arrList.get(j);
		}
		
		return arr;
    }

}
