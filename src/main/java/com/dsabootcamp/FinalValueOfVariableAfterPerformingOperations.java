package com.dsabootcamp;

public class FinalValueOfVariableAfterPerformingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] op = {"X++","++X","--X","X--"};
		
		System.out.println(finalValueAfterOperations(op));

	}
	

	public static int finalValueAfterOperations(String[] operations) {
		
		int x = 0;
		
		for (String str: operations) {
			if(str.charAt(1) == '+')
				x++;
			else x--;
		}
		
		return x;
	}
	

}
