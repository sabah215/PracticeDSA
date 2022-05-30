package com.dsabootcamp;

import java.util.Arrays;

public class DIStringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "III";
		
		System.out.print(Arrays.toString(diStringMatch(s)));

	}
	
	public static int[] diStringMatch(String s) {
		
		int [] perm = new int[s.length() + 1];
		
		int low = 0; int high = s.length(); int i = 0;
		
		while(i<s.length()) {
			
			if(s.charAt(i) == 'I') {
				perm[i++] = low++;
			}
			else {
				perm[i++] = high--;
			}
				
			i++;	
		}
		
		return perm;
		
	}

}
