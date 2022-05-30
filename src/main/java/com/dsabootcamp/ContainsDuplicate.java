//217. Contains Duplicate
//   https://leetcode.com/problems/contains-duplicate/

package com.dsabootcamp;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {2,3,3,4,2,6,4};
		
		System.out.println(containsDuplicate(nums));
	}
	
	public static int containsDuplicate(int[] nums) {
		
		int unique = 0;
		
		for (int num:nums) {
			unique ^= num;
		}
		
		return unique;
	}

}
