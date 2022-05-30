package com.dsabootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateProportion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-4);
		arr.add(3);
		arr.add(-9);
		arr.add(0);
		arr.add(4);
		arr.add(1);
		
		calculate(arr);

	}
	
	public static void calculate(List<Integer> arr) {
		
		int size = arr.size();
	    int countPos = 0;
	    int countNeg = 0;
	    int countZero = 0;
	    
	    Map<String, Integer> mapCount = new HashMap<>();
	    
	    for (int i : arr) {
	        if(i > 0)
	            mapCount.put("countPos", ++countPos);
	            
	        else if(i < 0)
	            mapCount.put("countNeg", ++countNeg);
	        else
	            mapCount.put("countZer", ++countZero);
	    }
	    
//	    for (Map.Entry<K, V>) {
//	        // System.out.println(size);
//
//	        double prop = mapCount.get(key) / size;
//	        System.out.printf("%.6f", prop);
//	        System.out.println();
//	    }
	    }

		
} 


