package com.ooppractice.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes sh = new Shapes();
		sh.area();
		
		System.out.println();
		Circle circle = new Circle();
//		circle.area();
		
		System.out.println();
//		Shapes circle2 = new Circle();
//		circle2.area();
		
		System.out.println();
		Shapes sq =  new Shapes();
		sq.area();
		
		
		List<String> aList = new ArrayList<>();
		aList.add("Sabah");
		aList.size();
		

	}

}
