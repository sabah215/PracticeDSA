package com.dsabootcamp;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		System.out.println("Factorial: " + factorial(num));

	}
	
	static int factorial(int num) {
		int result = num;
		
		if(num == 0) {
			return 1;
		}
		
		return num * factorial(num - 1);
	}

}
