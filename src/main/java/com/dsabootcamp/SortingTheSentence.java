package com.dsabootcamp;

import java.util.Arrays;

public class SortingTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "This1 is2 a3 sentence4";
//		
//		String [] sorted = s.split(" ");
		

//			int correct = Integer.parseInt(Character.toString(sorted[1].charAt(sorted[1].length()-1)));
		String r = sortSentence("Enthusiast6 Software4 I1 a3 Developer5 am2");
//		StringBuilder sb = new StringBuilder();
//		sb.append(r);
		System.out.println(r);
		
	
				
		

	}
	
	public static String sortSentence(String s) {
		
		String [] sorted = s.split(" ");
		String result = "";
		
		int i = 0;
		
		while(i < sorted.length) {
			
			int lastI = sorted[i].length() - 1;
		
			int c = Integer.parseInt(sorted[i].substring(lastI)) - 1;
//			int correct = Integer.parseInt(
//					Character.toString(sorted[i].charAt(
//									sorted[i].length()-1))) - 1;
			
			if (i != c) {
				swap(sorted, i, c);
			}
			else { i++; }
		}
		
//		StringBuilder sb = new StringBuilder();
		
		for (int j = 0; j < sorted.length; j++) {
			int len = sorted[j].length() - 1;
			
			if(j == sorted.length-1)
				result = result + sorted[j].substring(0, len) +"";
			else
				result = result + sorted[j].substring(0, len) + " ";
			
		}
		
		return result;
	}
	
	static void swap(String [] arr, int i, int j) {
		String temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
