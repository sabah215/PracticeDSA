/*
 * Leecode Problem No. 67
 * 
 * Add Binary
 * 
 * https://leetcode.com/problems/add-binary/
 * 
 * */

package com.dsabootcamp;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(addBinary("11","1"));

	}
	
	public static String addBinary(String a, String b) {
		
		if(a == null || a.isEmpty()){
            return b;
        }
        
        if(b ==null || b.isEmpty()){
            return a;
        }
        
        char[] first = a.toCharArray();
        char[] last = b.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        int i = first.length - 1;
        int j = last.length - 1;
        
        int aVal, bVal;
        int carry = 0; int sum ;
        
        while(i > -1 || j > -1 || carry == 1){
            
            aVal = (i > -1) ? Character.getNumericValue(first[i--]) : 0;
            bVal = (j > -1) ? Character.getNumericValue(last[j--])  : 0;
            
            
            sum = aVal ^ bVal ^ carry;
            carry = ((aVal + bVal + carry) >= 2) ? 1 : 0;
            sb.append(sum);
        }
        return sb.reverse().toString();
		
		
		
	}

}
