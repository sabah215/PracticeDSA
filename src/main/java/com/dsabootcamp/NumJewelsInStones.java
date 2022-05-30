package com.dsabootcamp;

public class NumJewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));

	}
	
	public static int numJewelsInStones(String jewels, String stones) {
		
		int count =0;
		
		for(int i = 0; i < jewels.length(); i++){
			
			char jl = jewels.charAt(i);
			
			for(int j=0; j< stones.length();j++) {
				char st = stones.charAt(j);
				if (jl == st) {
					count++;
				}
			}
			
		}
		return count;
	}

}
