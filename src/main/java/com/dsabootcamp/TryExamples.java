package com.dsabootcamp;

public class TryExamples {

	protected static class A{
		void fromA(){
			System.out.println("From Class A");
		}
	}

	public class B extends A{
		@Override
		void fromA(){
			System.out.println("fromA() called from class B");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("From main() with String array");



	}



}
