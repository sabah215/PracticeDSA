package com.dsabootcamp;

import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] nums = new int[3];
//		
//		System.out.println("Enter 3 numbers:");
		
		// #8
		System.out.println("Enter your marks: ");
//		
		Scanner in = new Scanner(System.in);
		
		int marks = in.nextInt();
		
		System.out.println("Your grade is " + displayGrade(marks));
//		
//		
//		for(int i =0; i< nums.length; i++) {
//			nums[i] = in.nextInt();
//		}
//		
//		for(int i =0; i< nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
//		System.out.println("Maximum number is " + getMax(nums));
//		System.out.println("Minimum number is " + getMin(nums));
		
		
	}

	static int getMin(int[] nums) {
		// TODO Auto-generated method stub
		int min = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i] < min)
				min = nums[i];
		}
		
		
		return min;
	}

	static int getMax(int[] nums) {
		// TODO Auto-generated method stub
		int max = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i] > max)
				max = nums[i];
		}
		
		
		return max;
	}
	
	// Problem #8
	static String displayGrade(int marks) {
		String grade = "Fail";
		
		if (marks > 90 && marks <= 100) {
			grade = "AA";
		}
	
	
		if (marks > 80 && marks <= 90) {
			grade = "AB";
		}
	

		if (marks > 70 && marks <= 80) {
			grade = "BB";
		}
		

		if (marks > 60 && marks <= 70) {
			grade = "BC";
		}
	
	
		if (marks > 50 && marks <= 60) {
			grade = "CD";
		}

	
		if (marks > 40 && marks <= 50) {
			grade = "DD";
		}
	

		return grade;	
			
	}
	
	
	
	
	
	

}
