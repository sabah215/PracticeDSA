package com.dsabootcamp;

public class ReversePrefixOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reversePrefix("xyxzxe", 'z'));

	}
	
	 public static String reversePrefix(String word, char ch) {
		 

		 
		 StringBuilder sb = new StringBuilder();
		 
		 int index = word.indexOf(ch);
		 
		 for (int i=index;i >= 0; i--) {
			 sb = sb.append(word.charAt(i));
		}
		 

		 if(index == -1)
			 return word;
		 
		 else {
			
				 sb = sb.append(word.substring(index+1,word.length()));
		 }
		 

		 
		 return sb.toString();
		 
	 }

}
