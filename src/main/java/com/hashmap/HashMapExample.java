package com.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String word = "aaaabbccccddddddseeeeeeeeeeeeee";
		
		HashMap<String, String> aMap = new HashMap<String, String>();
		
		
		
//		int [] arr = { 3, 2, 4 };
		
		aMap.put("dessert1", "Cookies");
		aMap.put("dessert2", "Hash Browns");
		aMap.put("dessert3", "Doughnut");
		aMap.put("dessert4", "Cake Pudding");
		aMap.put("dessert5", "Apple Pie");
		aMap.put("dessert6", "Icecream sandwich");
		
		
		Set<String> keys = aMap.keySet();
		
//		for (String i : keys) {
//			System.out.println(i);
//			System.out.println(aMap.get(i));
//		}
		for (Map.Entry e: aMap.entrySet()) {
			System.out.println(e.getKey() + " -> "+ e.getValue());
//			System.out.println(e.getValue());
		}
		
//		for(Entry e : aMap.entrySet()) {
////			System.out.println(e.getValue());	
//			System.out.println(e.getKey() + " " + e.getValue());	
//			
//		}
		
//		aMap.remove(3);
//		aMap.remove(5);
//		aMap.replace(4, "Sour cream");
//		aMap.replace(3, "Doughnut", "Cheese Cake");
//		
//		System.out.println(aMap);	
	
		// Entry Set to retrieve data
		
//		System.out.println(Arrays.toString(twoSum(arr, 6)));
		

	}
	
	public static int [] twoSum(int[] numbers, int target) {
		
			// returns indices of two numbers
		    int[] result = new int[2];
		    
		    
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    
		    
		    for (int i = 0; i < numbers.length; i++) {
		    	
		        if (map.containsKey(target - numbers[i])) {
		            result[1] = i;
		            result[0] = map.get(target - numbers[i]);
		            return result;
		        }
		        map.put(numbers[i], i );
		    }
		    return result;
		
	}
	
	
	
	

}
