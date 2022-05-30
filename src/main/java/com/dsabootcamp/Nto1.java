package com.dsabootcamp;

public class Nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printNum(5);
		printRev(5);
	}
	
	public static void printNum(int num) {
		
		if (num == 0) {
			return;
		}
		
		System.out.print(num + " ");
		printNum(num-1);
	}
	
	public static void printRev(int num) {
		
		if (num == 0) {
			return;
		}
		
		printRev(num-1);
		System.out.println(num + " ");
		
	}

}
