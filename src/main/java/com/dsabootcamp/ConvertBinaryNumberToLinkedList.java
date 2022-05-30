package com.dsabootcamp;

public class ConvertBinaryNumberToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,0,1};
		
		System.out.println(getDecimalValue(nums));

	}
	
	public static int getDecimalValue(int [] nums) {
		
		
		
		StringBuilder sb = null;
		
		if(nums != null) {
			
			sb = new StringBuilder();
			
			int i = 0;
			
			while(i< nums.length) {
				
				sb.append(nums[i]);
				
				i++;
			}
		}
		
		return Integer.parseInt(sb.toString());
		
	}
	
	 private class ListNode {
			
			int val;
			
			ListNode next;
			
			ListNode(){}
			ListNode (int val){ this.val = val;} 
			ListNode (int val, ListNode next){ this.val = val; this.next = next;} 
		}

}


