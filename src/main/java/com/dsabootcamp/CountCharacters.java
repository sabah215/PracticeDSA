package com.dsabootcamp;

// Incomplete

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str = {"hello","world","leetcode"};
		
		int sum = countCharacters(str, "welldonehoneyr");
		
		
		System.out.println(sum);
		
		

	}
	
	
	public static int countCharacters(String[] words, String chars) {
		int count =0;
		boolean isPresent = false;
		
		for (String word : words) {
			
			if(!hasDuplicate(word)) {
				
				for (int i=0; i< word.length(); i++) {
					if(!chars.contains(Character.toString(word.charAt(i)))) {
						isPresent = false;
						break;
					}
					else isPresent = true;
					
				}
			}
			else {isPresent=false;}
			
			if(isPresent) {
				count += word.length();
			}
		}
		
		return count;
	}
	
	public static boolean hasDuplicate(String s) {
		
		char [] c = s.toCharArray();
		for (int i=0; i<c.length; i++) {
			
			for(int j=i+1;j<c.length; j++) {
				
				if(s.charAt(i) == s.charAt(j)) {
					return true;
				}
			
			}
		}
		return false;
	}

}
