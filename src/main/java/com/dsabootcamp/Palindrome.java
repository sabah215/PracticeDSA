package com.dsabootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println(num + " is a palindrome");
		}
		else {
			System.out.println(num + " is not a palindrome");
		}
		
		
		
	}
	
	static boolean isPalindrome(int num) {
		
		
		// copied the number to palindrome variable to use it to reverse the number
		// num will be used to compare with reverse
		int palindrome = num; 
		
		// reversed number is stored
		int reverse = 0;
		
		while(palindrome != 0) {
			
			
			// separates the last digit of the number
			int remainder = palindrome % 10;
			
			// appends the last and the previous digits to reverse the number
			reverse = reverse * 10 + remainder;
			
			//Quotient is the previous numbers before the last digit
			palindrome = palindrome / 10;
			
		}
		
		return num == reverse;
		
	}

}
