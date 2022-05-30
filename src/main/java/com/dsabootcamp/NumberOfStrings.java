package com.dsabootcamp;

public class NumberOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] st = {"a","abc","bc","d"};
		
		System.out.println(numOfStrings(st, "abc"));

	}
	
	public static int numOfStrings(String[] patterns, String word) {
		
		int count = 0;
		
		for(String p: patterns) {
//			
			if(word.contains(p)) {
				count++;
			}
		}
		
		return count;
	}

}
