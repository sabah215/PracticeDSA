package com.dsabootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisapperedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,2,7,8,2,3,1};
		
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		List<Integer> sorted = findDisapperedNumber(arr);
		
		
		for (int i: sorted) {
			System.out.print(Integer.toString(i) + ", ");
		}
	}
	
	
	static List<Integer> findDisapperedNumber(int [] arr) {
		
		int i=0;
		
		while(i < arr.length) {
			
			int index = arr[i] -1;
			
			if(arr[i] != arr[index]){
				swap(arr,i,index);
				
			}
			else {
				i++;
			}
			
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int j=0; j< arr.length; j++) {
			
		
			
			if(arr[j] != j + 1) {
				list.add(j+1);
			}
		}
		
		 return list;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
