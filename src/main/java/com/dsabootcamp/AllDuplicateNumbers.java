package com.dsabootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] arr = {4,3,2,7,8,2,3,1};
		
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		List<Integer> sorted = findDuplicates(arr);
		
		
		for(int i:sorted) {
			System.out.print(Integer.toString(i) + ", ");
		}

	}
	
	 static List<Integer> findDuplicates(int[] nums) {
		 
		 List<Integer> list = new ArrayList<Integer>();
		 
		 int i = 0;
			
			while(i < nums.length) {
				 
				int correct = nums[i] - 1;
					
					if(nums[i] != nums[correct]) {
						swap(nums, i, correct);
					}
					
					else {
						i++;
					}
					
				}
				
			for(int j=0; j<nums.length;j++) {
				
				if(nums[j] != j+1) {
					
					list.add(nums[j]);
				}
			}
				
			
			return list;
	 }
	 
	 static void swap(int [] arr, int i, int j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}

}
