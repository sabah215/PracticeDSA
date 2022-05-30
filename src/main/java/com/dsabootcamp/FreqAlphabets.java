package com.dsabootcamp;

public class FreqAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 String s = "12";
		

		 System.out.println(freqAlphabets(s));
	}
	
	public static String freqAlphabets(String s) {
		
		int last = s.length() - 1;
		int n=0;
		StringBuilder map = new StringBuilder("");
		
		for (int i = last; i > -1; i--) {
			
			if(s.charAt(i) == '#') {
				
				 n = s.charAt(--i) - '0' + (s.charAt(--i) - '0') * 10;
				 map.append((char)(n + 96));
			}
			
			else {
				 map.append((char)(s.charAt(i) + 48));
			}			
			
		}
		return map.reverse().toString();

	}

}
