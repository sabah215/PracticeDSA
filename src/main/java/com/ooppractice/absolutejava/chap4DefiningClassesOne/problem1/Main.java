package com.ooppractice.absolutejava.chap4DefiningClassesOne.problem1;

import com.ooppractice.absolutejava.chap4DefiningClassesOne.problem2.CalAge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a letter:");
//		
//		String letter = in.next();
//		
//		
//		System.out.println("Enter a number:");
//		Scanner in2 = new Scanner(System.in);
//		
//		int number = in2.nextInt();
//		
//		PrintCodeWord code = new PrintCodeWord(letter, number);
//		System.out.println();
//		code.printCode();
		
		

//		System.out.println("Enter your date of birth:");
//		
//		int date = in.nextInt();
//		String month = in.next();
//		int year = in.nextInt();
//		
		CalAge age = new CalAge(21, 5, 1987);
//		System.out.println(age.getDay());
//		System.out.println(age.getMonth());
//		System.out.println(age.getYear());
		
		System.out.println(age.getToday());
		
	}

}
