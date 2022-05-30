package com.stackandqueue;

import com.stackandqueue.CustomStack;

public class DynamicStack extends CustomStack {
	
	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int size) {
		super(size);
	}
	
	@Override
	public boolean push(int item) {
		
		//check if array is full
		if(this.isFull()) {
			
			// Create a new array of double the array size
			int [] temp = new int[data.length * 2];
			
			// Copy all previous data to the temp array
			for(int i=0; i<data.length; i++) {
				
				temp[i] = data[i];
			}
			
			//point data to temp
			data =temp;
			
		}
		
		
		// at this point we know that array is not full
		// insert item;
		return super.push(item);
		
		
	}

}
