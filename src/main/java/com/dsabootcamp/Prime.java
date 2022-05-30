package com.dsabootcamp;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first number: ");
		Scanner in1 = new Scanner(System.in);
		int num1 =  in1.nextInt();
		
		System.out.println("Enter second number: ");
		Scanner in2 = new Scanner(System.in);
		int num2 =  in2.nextInt();
		
		System.out.print("Prime Numbers are: ");
		
		for(int i = num1; i< num2; i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}

	}
	
	static boolean isPrime(int num) {
		
		 if(num <= 1)
			 return false;
		 
		 
		 int i = 2; 
		 
		 while(i * i < num) {
			 
			 if((num % i) == 0)
				 return false;
			 
			 i++;
		 }
		 return i * i > num;
	}

}
