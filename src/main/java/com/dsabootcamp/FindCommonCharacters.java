package com.dsabootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] words = {"cool","lock","cook"};
		
		List<String> repeat = commonChars(words);
		
		for (int i= 0; i < repeat.size(); i++) {
			System.out.print(repeat.get(i));
		}
	}
	
	public static List<String> commonChars(String[] words) {
		
		List<String> repeat = new ArrayList<String>();
		
		boolean isPresent = true;
		
		for(int i=0; i< words[0].length(); i++) {
			
			for(int j = 1; j<words.length; j++) {
				
				if(!words[j].contains(Character.toString(words[0].charAt(i)))) {
					isPresent =false;
					break;
				}
				isPresent = true;
				words[j] = words[j].replaceFirst(Character.toString(words[0].charAt(i)), "");
			}
			
			if(isPresent) {
				repeat.add(Character.toString(words[0].charAt(i)));
			}
			
		}
		
		return repeat;
	}

}
